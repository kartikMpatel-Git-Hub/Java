/**
 3174. Clear Digits
 You are given a string s.
 Your task is to remove all digits by doing this operation repeatedly:
 Delete the first digit and the closest non-digit character to its left.
 Return the resulting string after removing all digits.
 * */
package leetcode;
import java.util.HashMap;

public class DailyQuationFeb10 {
    public static String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        int idx = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                str.append(s.charAt(i));
                idx++;
            }
            else{
                str.deleteCharAt(idx);
                idx--;
            }
        }

        return str.toString();
    }

        public static void main(String[] args) {
            System.out.println(clearDigits("acb34"));
        }
}
