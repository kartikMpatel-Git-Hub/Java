package Basic_Java.string;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello");
        str.append("Hello");
        System.out.println(str);
        System.out.println(str.capacity());
//        str.append("Hello");
//        str.append("Hello");
//        str.append("Hello");
//        System.out.println(str.capacity());
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        str.setCharAt(1,'K');
        System.out.println(str);

    }
}
