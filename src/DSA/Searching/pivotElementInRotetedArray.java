// This Code Is For Find Pivot In Dupliacte Roteted Array

public class pivotElementInRotetedArray{
    public static int findPivot(int[] nums){
        int left  = 0,right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            
            //it will check that if mid value is Grater Than Next Value Then That Is(MID) pivot and also check mid is less T
            // Than Right For Handle OutofBound Error
            if(mid < right && nums[mid] > nums[mid + 1])
                return mid;
            
            //it will check that if mid value is less Than previous Value Then That Is(MID - 1) pivot and also check mid is Grater
            // Than ledt For Handle OutofBound Error
            if(mid > left && nums[mid] < nums[mid - 1])
                return mid - 1;

            //It Will Use Full To Check When All Value LEFT RIGHT AND MID ARE Same
            if(nums[mid] == nums[left] && nums[right] == nums[mid]){
                //Then We Have To Skip Start ANd end But Before Skip We Have to check that left or right Is Pivot Or Not

                /*
                 * here it Will Check is Left Value Is Greate Than NExt If Yes Then Pivot Is left
                 */
                if(nums[left] > nums[left + 1])
                    return left;
                
                /*
                 * here it Will Check is right Value Is less Than previous If Yes Then Pivot Is right - 1 value
                 */
                if(nums[right] < nums[right - 1])
                    return right - 1; 
                
                /*
                 * if Nothing happeng(If None Of Them Are Pivot Then We Skip Them)
                 */
                left++;
                right--;
            }
            /*
             * Here It First Check is left Value Is Small Than Mid Then We Are Already In Accending Order So We Have To 
             * change The Side 
             * 
             * if It found Same Value Then We Have To check (left == mid) then 
             * Number Of Mid Is Greater Than right if yes Then We have to change the sied To Right Side Of Mid 
             * if All Condition Are False Then We Are In Decending So Now We Have To check On Left Side Of Mid
             */
            if(nums[left] < nums[mid] || (nums[mid] == nums[left] && nums[mid] > nums[right]))
                left = mid + 1;
            else 
                right = mid - 1;
        }

        return -1;
    }
}