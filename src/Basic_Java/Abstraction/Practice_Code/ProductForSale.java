public abstract class ProductForSale {
    String type;
    double price;
    String description;

    
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    void printedItem(int qty){
        System.out.println("\nName : " + type);
        System.out.println("Description  : " +description);
        System.out.println("price  : " + price);
        System.out.println("Quntity  : " + qty);
        System.out.println("Total Amount  : " + getSalesPrice(qty));
    }

    double getSalesPrice(int qty){
        return (price * qty);
    }

    abstract void showDetails();
}