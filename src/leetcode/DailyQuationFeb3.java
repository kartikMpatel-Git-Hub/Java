/*
3105. Longest Strictly Increasing or Strictly Decreasing Subarray
You are given an array of integers nums. Return the length of the longest
subarray of nums which is either strictly increasing  or strictly decreasing.
* */
package leetcode;

public class DailyQuationFeb3 {

    public static int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int incre = 1;
        int decre = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                incre++;
                decre = 1;
            }
            else if(nums[i] < nums[i-1]){
                decre++;
                incre =1;
            }
            else{
                incre = 1;
                decre = 1;
            }
            max = Math.max(max,Math.max(incre,decre));
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,3,3,2};//[3,3,3,3]
        System.out.println(longestMonotonicSubarray(nums));
    }
}
