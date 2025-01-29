package DSA.Graph;

public class GraphWithMatrix {

    static void createGraph(int[][] graph,int[][] edge,boolean isDirected){
        for(int ele[] : edge){
            int from = ele[0];
            int to = ele[1];
            int weight = ele[2];
            if(isDirected){
                graph[from][to] = weight;
            }
            else {
                graph[from][to] = weight;
                graph[to][from] = weight;
            }
        }
    }

    static void display(int[][] graph){
        for(int row[] : graph){
            System.out.print("{");
            for(int ele : row){
                System.out.print(" " + ele + " ");
            }
            System.out.println("}");
        }
    }
    public static void main(String[] args) {
        int edge[][] ={
                {0,1,3},
                {0,2,4},
                {1,2,5}
        };
        int n = 3;
        int graph[][] = new int[n][n];
        int graph1[][] = new int[n][n];
        createGraph(graph,edge,true);
        createGraph(graph1,edge,false);
        display(graph);
        System.out.println();
        display(graph1);
    }
}
