package Challenge_Abstratction;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String description, double price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public double getSalesPrice(int qty){
        System.out.println(qty*price);
        return qty*price;
    }

    public void getPricedLineItem(int qty){

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty,price,type,description);

    }

    public abstract void showDetails();

}
