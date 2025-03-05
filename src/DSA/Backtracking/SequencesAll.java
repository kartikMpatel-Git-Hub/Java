package DSA.Backtracking;

import java.util.HashSet;

public class SequencesAll {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        /// Easy Method But Takes More TIme
//        boolean validate[] = new boolean[str.length()];
//        HashSet<String> set = new HashSet<>();
//        sequence(str,validate,set,"");
//        for(String item : set){
//            System.out.println(item + "\t");
//        }

        /// Time Managed Method
        int freq[] = new int[26];
        for(int i = 0; i < str.length(); i++)
            freq[str.charAt(i) - 'A']++;
//        sequence(freq);
        System.out.println(sequence(freq));
    }

    private static void sequence(String str, boolean[] validate, HashSet<String> set, String curr) {
        if(set.contains(curr))return;
        set.add(curr);
//        System.out.println(curr);
        for(int i = 0; i < str.length(); i++){
            if(validate[i]) continue;
            validate[i] = true;
            sequence(str,validate,set,curr + str.charAt(i));
            validate[i] = false;
        }
    }

    private static int sequence(int freq[]) {
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0)continue;
            count++;
            freq[i]--;
            count += sequence(freq);
            freq[i]++;
        }
        return count;
    }

}
