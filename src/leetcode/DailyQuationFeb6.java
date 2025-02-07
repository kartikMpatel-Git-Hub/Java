/*
1790. Check if One String Swap Can Make Strings Equal
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
* */
package leetcode;
import java.util.ArrayList;
import java.util.HashMap;

public class DailyQuationFeb6 {

    public static int tupleSameProduct(int[] nums) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int product = nums[i] * nums[j];
                if(map.containsKey(product)){
                    map.put(product,map.get(product)+1);
                }
                else{
                    map.put(product,1);
                }
            }
        }
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            sum += ((val * (val - 1) )/ 2) * 8;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,6};
        System.out.println(tupleSameProduct(arr));
    }
}
