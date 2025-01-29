package DSA.Graph;

import java.util.ArrayList;

public class DFS {
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
                dfs(i,visited,list,result);
            }
        }
        System.out.println(result);
//        return result;
    }

    private static void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> list, StringBuilder result) {
        visited[i] = true;
        result.append("->"+i);
        for(int l : list.get(i)){
            if(!visited[l]){
                dfs(l,visited,list,result);
            }
        }
    }
}
