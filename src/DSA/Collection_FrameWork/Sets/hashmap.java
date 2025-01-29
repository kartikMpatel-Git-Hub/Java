import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<Integer,String> H = new HashMap<>();
        H.put(1,"One");
        H.put(2,"Two");
        H.put(3,"Three");
        H.put(4,"four");

        // System.out.println(H);
        int i = 0;
        for(;;){
            if(!H.containsKey(i))
                break;
            System.out.println(H.get(i));
            i++;
        }
    }
}