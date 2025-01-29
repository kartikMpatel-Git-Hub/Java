import java.util.ArrayList;

public class listinsidelist {
    public static void main(String[] args) {
        ArrayList<ArrayList <String>> mainList = new ArrayList<ArrayList <String>>();
        ArrayList<String> oneList = new ArrayList<>();
        ArrayList<String> twoList = new ArrayList<>();
        oneList.add("Hello");
        oneList.add("Hello1");
        oneList.add("Hello2");
        twoList.add("Hello");
        twoList.add("Hello1");
        twoList.add("Hello2");
        mainList.add(oneList);
        mainList.add(twoList);

        System.out.println(mainList);
    }
}
