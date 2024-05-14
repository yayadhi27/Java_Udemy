package Challenge_OOPMaster;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "Medium";

    public Item(String name, double price, String type) {
        this.name = name.toUpperCase();
        this.price = price;
        this.type = type.toUpperCase();
    }

    public Item() {

    }

    public double getBasePrice(){
        return price;
    }

    public String getName(){

        if(type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n",name,price);
    }

    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
