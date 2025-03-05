package DSA.Recursion;

public class SubString {
    public static void main(String[] args) {
        String str = "abc";
        subString("",str);
    }

    private static void subString(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subString(p + ch,up.substring(1));
        subString(p,up.substring(1));
    }


}
