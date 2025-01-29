package DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphWithList {

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
                {0,2},
                {1,2}
        };
        int n = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list1.add(new ArrayList<>());
        }
        createGraph(list,edge,true);
        createGraph(list1,edge,false);
        System.out.println(list);
        System.out.println(list1);

    }
}
