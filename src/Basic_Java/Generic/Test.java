package Basic_Java.Generic;

public class Test {
    
    public static void main(String[] args) {
        String test = "1234567890";
        for(int i = 0; i<10; i++){
            int dig = test.charAt(i);
            System.out.println(dig);
        }
    }
}
