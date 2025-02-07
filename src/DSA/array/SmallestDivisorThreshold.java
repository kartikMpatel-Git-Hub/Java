/*
* 1283. Find the Smallest Divisor Given a Threshold
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).

* Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
* */
package DSA.array;

public class SmallestDivisorThreshold {

    public static boolean isPossible(int nums[],int divisor,int theashold){
        int sumOfDiv = 0;
        for(int i = 0 ; i < nums.length; i++){
            sumOfDiv += nums[i] / divisor;
            if(nums[i] % divisor != 0){
                sumOfDiv++;
            }
            if(sumOfDiv > theashold){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MAX_VALUE;
        for(int  i = 0; i < nums.length; i++){
            if(nums[i] > end){
                end = nums[i];
            }
        }
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(isPossible(nums,mid,threshold)){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,5,9},threshold = 6;
        SmallestDivisorThreshold s = new SmallestDivisorThreshold();
        System.out.println(s.smallestDivisor(nums,threshold));
    }
}
