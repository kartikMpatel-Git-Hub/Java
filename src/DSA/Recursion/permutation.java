package Recursion;

import java.util.ArrayList;

public class permutation {

    public static void permutations(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> p,int nums[],boolean check[]){
        if(p.size() == nums.length && !ans.contains(p)){
//            System.out.println(p);
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(check[i]) continue;
            check[i] = true;
            p.add(nums[i]);
            permutations(ans,p,nums,check);
            check[i] = false;
            p.remove(p.size()-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int arr[] = {1,2,3};
        permutations(ans,new ArrayList<>(),arr,new boolean[arr.length]);
        System.out.println(ans);
    }
}
