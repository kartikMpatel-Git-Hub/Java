package DSA.Graph;

import java.util.ArrayList;

public class GraphWithWightList {
        static class Pair{
            int node;
            int wight;

            Pair(int to,int wight){
                this.node = to;
                this.wight = wight;
            }
            @Override
            public String toString() {
                return "(" + node + " , " + wight + ")";
            }
        }

        static void createGraph(ArrayList<ArrayList<Pair>> list, int[][] edge, boolean isDirected){
            for(int ele[] : edge){
                int from = ele[0];
                int to = ele[1];
                int weight = ele[2];
                if(isDirected){
                    Pair p = new Pair(to,weight);
                    list.get(from).add(p);
                }
                else {
                    Pair p1 = new Pair(to,weight);
                    Pair p2 = new Pair(from,weight);
                    list.get(from).add(p1);
                    list.get(to).add(p2);
                }
            }
        }
        public static void main(String[] args) {
            int edge[][] ={
                    {0,1,3},
                    {0,2,4},
                    {1,2,5}
            };
            int n = 3;
            ArrayList<ArrayList<Pair>> list1 = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list1.add(new ArrayList<>());
            }
            ArrayList<ArrayList<Pair>> list2 = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list2.add(new ArrayList<>());
            }
            createGraph(list1,edge,true);
            createGraph(list2,edge,false);
            System.out.println(list1);
            System.out.println(list2);

        }

}
