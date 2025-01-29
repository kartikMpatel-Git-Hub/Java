import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        
        ArrayList<OrderItem> order1 = new ArrayList<>();
        order1.add(new OrderItem("Iphone 15", 50000,"Good Phone But High Price",2));
        order1.add(new OrderItem("Iphone 12", 35000,"Average Phone But Good Price",3));
        
        printValue(order1);
        
        ArrayList<OrderItem> order2 = new ArrayList<>();
        order2.add(new OrderItem("Iphone 14", 40000,"Good Phone But High Price",1));
        order2.add(new OrderItem("Iphone 13", 35000,"Average Phone But Good Price",3));
        
        printValue(order2);

    }

    static void printValue(ArrayList<OrderItem> order){

        for(var item : order){
            System.out.println("-".repeat(50));
            item.showDetails();
        }

        return ;
    }
}
