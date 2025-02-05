/*
1752. Check if Array Is Sorted and Rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
* */
package leetcode;

public class DailyQuationFeb2 {

    public static int findPivot(int[] nums){
        int left  = 0,right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid < right && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > left && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[mid] == nums[left] && nums[right] == nums[mid]){
                if(nums[left] > nums[left + 1])
                    return left;
                if(nums[right] < nums[right - 1])
                    return right - 1;
                left++;
                right--;
            }
            if(nums[left] < nums[mid] || (nums[mid] == nums[left] && nums[mid] > nums[right]))
                left = mid + 1;
            else
                right = mid - 1;
        }

        return 0;
    }
    private static boolean isSorted(int arr[],int start,int end){
        for(int i = start+1; i <= end; i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
    public static boolean check(int[] arr) {
        int n = arr.length;
        if(!isSorted(arr,0,n-1)){
            int pivot = findPivot(arr);
            if(!isSorted(arr,0,pivot) || !isSorted(arr,pivot+1,n-1)){
                return false;
            }
            if(arr[0] < arr[n-1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};//[2,1,3,4]
        System.out.println(check(nums));
    }
}
