/*
1790. Check if One String Swap Can Make Strings Equal
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
* */
package leetcode;
import java.util.HashMap;

public class DailyQuationFeb7 {

//     Almost Solved Solution Last 4 Test Case Which Hash Large Data
     /** class Solution {
     public int[] queryResults(int limit, int[][] q) {
         HashMap<Integer,Integer> map = new HashMap<>();
         int idx = 0;
         int ans[] = new int[q.length];
         for(int ele[] : q){
             // if(ele[0] != ele[1])
             map.put(ele[0],ele[1]);
             HashSet<Integer> set = new HashSet<>();
             for (Integer value : map.values()) {
                 set.add(value);
             }
                ans[idx++] = set.size();
             }

             return ans;
         }
    }**/
        public static int[] queryResults(int limit, int[][] queries) {
            HashMap<Integer,Integer> color = new HashMap<>();
            HashMap<Integer,Integer> ball = new HashMap<>();
            int [] res = new int [queries.length];

            for(int i=0;i<queries.length;i++){
                int newball = queries[i][0];
                int col = queries[i][1];
                if(ball.containsKey(newball)){
                    int prev = ball.get(newball);
                    color.put(prev,color.getOrDefault(prev,0)-1);
                    if(color.get(prev)==0){
                        color.remove(prev);
                    }
                }
                ball.put(newball,col);
                color.put(col,color.getOrDefault(col,0)+1);
                res[i]=color.size();
            }
            return res;
        }

    public static void main(String[] args) {
        int arr[][] = {{1,4},{2,5},{1,3},{3,4}};
        System.out.println(queryResults(4,arr));
    }
}
