/*
You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
Return the total number of bad pairs in nums.

j - i == nums[j] - nums[i] Is Good Pair
Mathametically
nums[i] - i = nums[j] - j Is Good Pair
* */
package leetcode;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DailyQuationFeb9 {
        public static long countBadPairs(int[] nums) {
            long goodPair = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int diff = nums[i] - i;
                goodPair += map.getOrDefault(diff,0);
                map.put(diff,map.getOrDefault(diff,0)+1);
            }
            return (long) nums.length * (nums.length - 1) / 2 - goodPair;

        }

        public static void main(String[] args) {
            System.out.println(countBadPairs(new int[] {4,1,3,3}));
        }
}
