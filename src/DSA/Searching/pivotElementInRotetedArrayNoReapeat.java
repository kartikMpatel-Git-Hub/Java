public class pivotElementInRotetedArrayNoReapeat {
    public static int findPivot(int[] nums){
        int left  = 0,right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid < right && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > left && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[mid] >= nums[left])
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return -1;
    }
}
