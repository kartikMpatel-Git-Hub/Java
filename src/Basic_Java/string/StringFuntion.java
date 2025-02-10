package Basic_Java.string;

import java.awt.*;

import static java.lang.String.copyValueOf;

public class StringFuntion {

    public static void compare(){
        String str = "Hello ";
//        String strStr = str;
        String newStr = new String("HELLO ");
//        System.out.println(str == newStr);
//        System.out.println(str == strStr);
        System.out.println(str.equalsIgnoreCase(newStr));
//        str = str.concat("World");
//        System.out.println(str);
//
//        System.out.println(str.compareTo(strStr));
    }

    public static void copyValue(){
        String str = new String("Hello World");
//        char charArr[] = str.toCharArray();
//        String newStr = copyValueOf(charArr,0,4);
//        System.out.println(newStr);
        char charArr1[] = new char[10];
        str.getChars(0,4,charArr1,0);
        System.out.println(charArr1);
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        String changeString = str.replace("l","k");
        System.out.println(changeString);
        System.out.println(str.startsWith("Hell"));
        String newNewString = new String("   H E L L O    ");
        System.out.println(newNewString);
//        newNewString = newNewString.trim().toLowerCase();
        newNewString = newNewString.trim();
        System.out.println(newNewString);
        System.out.println(str instanceof String);
//        System.out.println(str instanceof StringFuntion);
    }
    public static void main(String[] args) {
//        compare();
        copyValue();
    }
}
