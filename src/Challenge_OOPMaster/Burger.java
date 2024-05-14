package Challenge_OOPMaster;

public class Burger extends Item{
    public Item extra1;
    public Item extra2;
    public Item extra3;

    public Burger(String name, double price) {
        super(name, price, "Burger");
    }

    public Burger() {
        super();
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice() + ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){

        return switch(toppingName.toUpperCase()){
            case "AVOCADO","CHEESE" -> 1.0;
            case "BACON","HAM" -> 2.0;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1,String extra2, String extra3){

        this.extra1 = new Item(extra1,getExtraPrice(extra1),"Toppings");
        this.extra2 = new Item(extra2,getExtraPrice(extra2),"Toppings");
        this.extra3 = new Item(extra3,getExtraPrice(extra3),"Toppings");

    }
    public void addToppings(String extra1,String extra2){

        this.extra1 = new Item(extra1,getExtraPrice(extra1),"Toppings");
        this.extra2 = new Item(extra2,getExtraPrice(extra2),"Toppings");

    }
    public void addToppings(String extra1){

        this.extra1 = new Item(extra1,getExtraPrice(extra1),"Toppings");
    }



    public void printItemizedList(){
        printItem(getName(),getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }


    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("--".repeat(20));
        super.printItem();
    }




}
