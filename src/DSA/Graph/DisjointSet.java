package DSA.Graph;

import java.util.ArrayList;
import java.util.List;

class DSU {
    List<Integer> rank = new ArrayList<>();//To Store Rank Of Node
    List<Integer> parent = new ArrayList<>();//To Store Parent Of Node

    DSU(int n){
        for(int i = 0; i <= n; i++){
            rank.add(0);    //Initially All Node's Rank is 0
            parent.add(i); //Initially All Node's Parent is Node itself
        }
    }

    int findParent(int n){
        if(n == parent.get(n)){
            return n; //When It reaches To Main Parent
        }
        int mainParent = findParent(parent.get(n)); //It Will Find Main Parent
        parent.set(n,mainParent); //After Finding Main Parent It Will Replace It
        return parent.get(n); // After Replace It Will Return for Furture
    }

    void addInGraph(int u,int v){
        int ulp_u = findParent(u);  //It Will Find Main Parent Of U
        int ulp_v = findParent(v);  //It Will Find Main Parent Of V
        if(ulp_v == ulp_u)  // If Both Are At Have Same Main Parent Then No Change
            return;
        else if(rank.get(ulp_v) > rank.get(ulp_u)){ // If Rank Of V is Higher than U Will Add To it If They From
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_v) < rank.get(ulp_u)){ // If Rank Of U is Higher than V Will Add To it If They From
            parent.set(ulp_v,ulp_u);
        }
        else{   // If Both are Different Parent And Have Same Rank
            parent.set(ulp_v,ulp_u); // It adds Into Parent Set
            int rankU = rank.get(ulp_u); //It Takes Check Then Of Main parent Node
            rank.set(ulp_u,rankU+1); // After Getting Rank It Increases The Rank
        }
    }
}
public class DisjointSet{
    public static void main(String[] args) {
        DSU d = new DSU(7);
        d.addInGraph(1,2);
        d.addInGraph(2,3);
        d.addInGraph(4,5);
        d.addInGraph(6,7);
        d.addInGraph(5,6);

//        if(d.findParent(3) == d.findParent(7)){
//            System.out.println("Same");
//        }
//        else {
//            System.out.println("Not Same");
//        }
//        d.addInGraph(3,7);
//        if(d.findParent(3) == d.findParent(7)){
//            System.out.println("Same");
//        }
//        else {
//            System.out.println("Not Same");
//        }
//        if(d.findParent(2) == d.findParent(2)){
//            System.out.println("Same");
//        }

    }
}