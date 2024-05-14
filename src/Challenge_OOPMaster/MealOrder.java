package Challenge_OOPMaster;

public class MealOrder extends Burger{
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder(){
        this("regular","coke","fries");
    }


    public MealOrder(String burgerType, String drinkType, String sideType){
        super();
        this.burger = new Burger(burgerType,5);
        this.drink = new Item(drinkType,1.5,"drink");
        this.side = new Item(sideType,1.0,"side");
    }

    public double getTotalPrices(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemList(){
        burger.printItemizedList();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(20));
        Item.printItem("Total Price",getTotalPrices());

    }



}
