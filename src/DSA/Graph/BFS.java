package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static void createGraph(ArrayList<ArrayList<Integer>> list, int[][] edge, boolean isDirected){
        for(int ele[] : edge){
            int from = ele[0];
            int to = ele[1];
            if(isDirected){
                list.get(from).add(to);
            }
            else {
                list.get(from).add(to);
                list.get(to).add(from);
            }
        }
    }
    public static void main(String[] args) {
        int edge[][] ={
                {0,1},
                {1,5},
                {2,3},
                {4,2},
                {4,6},
                {5,4},
                {5,7}
        };
        int n = 8;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        createGraph(list,edge,false);
        System.out.println(list);
        pathPrint(n,list);
    }

    private static void pathPrint(int node,ArrayList<ArrayList<Integer>> list) {

        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[node];
        for(int i = 0; i < node; i++){
            if(!visited[i]){
                bfs(i,visited,list,result);
            }
        }
        System.out.println(result);
    }

    public static void bfs(int num,boolean[] visited,ArrayList<ArrayList<Integer>> list,StringBuilder str){
        visited[num] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        while (!q.isEmpty()){
            int node = q.poll();
            str.append(node + " ,");
            for(int near : list.get(node)){
                if(!visited[near]){
                    visited[near] = true;
                    q.add(near);
                }
            }
        }
    }

//    private static void bfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> list, StringBuilder result) {
//        visited[i] = true;
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(i);
//        while (!queue.isEmpty()){
//            int node = queue.poll();
//            result.append( node + " ,");
//            for(int ele : list.get(node)){
//                if(!visited[ele]){
//                    visited[ele] = true;
//                    queue.add(ele);
//                }
//            }
//        }
//    }
}
