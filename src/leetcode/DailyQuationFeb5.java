/*
1790. Check if One String Swap Can Make Strings Equal
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
* */
package leetcode;
import java.util.ArrayList;

public class DailyQuationFeb5 {

    public static boolean isAnagram(String s1,String s2){
        int charIdx[] = new int[26];
        for(int i = 0; i < s1.length(); i++){
            charIdx[s1.charAt(i) - 'a']++;
            charIdx[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(charIdx[i] != 0)
                return false;
        }
        return true;
    }

    public static String toString(char chr[]){
        String str = new String(chr);
        return str;
    }

    public static boolean areAlmostEqual2(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        ArrayList<Integer> idx = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                idx.add(i);
            }
        }
        if(idx.size() != 2) return false;
        int first = idx.get(0);
        int last = idx.get(1);
        if(s1.charAt(first) == s2.charAt(last) && s1.charAt(last) == s2.charAt(first))
            return true;
        return false;
    }

    public static boolean areAlmostEqual(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        ArrayList<Integer> idx = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                idx.add(i);
            }
        }
        if(idx.size() != 2) return false;
        int first = idx.get(0);
        int last = idx.get(1);
        if(s1.charAt(first) == s2.charAt(last) && s1.charAt(last) == s2.charAt(first))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String st1 = "bank"; //attack
        String st2 = "kanb"; //defend
        System.out.println(areAlmostEqual(st1,st2)); // More Optimized
        System.out.println(areAlmostEqual2(st1,st2));//With Second Method Which Is Simple But More Time Complex
    }
}
