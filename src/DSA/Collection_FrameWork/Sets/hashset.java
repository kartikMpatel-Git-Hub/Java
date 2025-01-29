import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> H = new HashSet<>();
        H.add(1);
        H.add(2);
        H.add(1);
        H.add(1);

        System.out.println(H);
    }
}
