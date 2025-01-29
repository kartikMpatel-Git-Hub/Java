public class OrderItem extends ProductForSale{

    int qty;
    public OrderItem(String type, double price, String description,int qty) {
        super(type, price, description);
        this.qty = qty;
    }

    @Override
    void showDetails() {
        super.printedItem(qty);
    }
    
}
