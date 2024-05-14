package Challenge_OOPMaster;

public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("coke",2,"Drink");
//        coke.printItem();
//        coke.setSize("Large");
//        coke.printItem();


//        Burger burger = new Burger("single",20);
//        burger.addToppings("avocado");
//        burger.printItem();


        MealOrder meal1 = new MealOrder("Single Burger","Mountain dew","fries");
        meal1.addToppings("cheese");
        meal1.printItemList();

    }
}
