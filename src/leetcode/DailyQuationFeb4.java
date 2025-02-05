/*
1800. Maximum Ascending Subarray Sum
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.
A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.
* */
package leetcode;

public class DailyQuationFeb4 {

    public static int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                sum += nums[i];
            }
            else{
                max = Math.max(max,sum);
                sum = nums[i];
            }
        }
        max = Math.max(max,sum);

        return max;
    }

    public static void main(String[] args) {
        int nums[] = {10,20,30,5,10,50};//[12,17,15,13,10,11,12]
        System.out.println(maxAscendingSum(nums));
    }
}
