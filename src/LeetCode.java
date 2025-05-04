import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCode {

    public static boolean isPrime(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }

    public static int leet(int[] fruits,int[] baskets){
        boolean[] isFll = new boolean[baskets.length + 1];
        int count = fruits.length;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if (fruits[i] <= baskets[j] && !isFll[j]){
                    isFll[j] = true;
                    count--;
                    break;
                }
                else if(j+1 < baskets.length && fruits[i] <= baskets[j+1] && !isFll[j+1]){
                    isFll[j+1] = true;
                    count--;
                    break;
                }
                else if(j-1 >= 0 && fruits[i] <= baskets[j-1] && !isFll[j-1]){
                    isFll[j-1] = true;
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void helper(HashSet<Integer> set,boolean[] validate,int[] digits,int size,int ans){
        if((int) (Math. log10(ans) + 1) == 3){
            if(ans % 2 == 0)
                set.add(ans);
        }
        for(int i = 0; i < digits.length; i++){
            if(!validate[i]){
                validate[i] = true;
                helper(set,validate,digits,size+1,ans*10+digits[i]);
                validate[i] = false;
            }
        }
    }
    public static int maxSum(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] <= 0){
                    continue;
                }
                if(!set.contains(nums[j])){
//                    System.out.println(nums[j]);
                    set.add(nums[j]);
                    sum += nums[j];
                }
            }
            ans = Math.max(ans,sum);
            set.clear();
        }
        return ans;
    }
//    public static void leet(int[] digits){
//        HashSet<Integer> set = new HashSet<>();
//        boolean[] valid = new boolean[digits.length+1];
//        helper(set,valid,digits,0,0);
//        System.out.println(set.size());
//    }


    public static void main(String[] args) {
//        int arr1[] ={38,65,8};
//        int arr2[] = {27,10,47};
//        System.out.println(leet(arr1,arr2));
//        int dig[] = {0,2,2};
//        leet(dig);
        int[] nums = {1,1,0,1,1};
        System.out.println(maxSum(nums));
    }
}
