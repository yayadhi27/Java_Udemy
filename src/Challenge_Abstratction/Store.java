package Challenge_Abstratction;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("oil painting",50,"camelin oil painting"));
        storeProducts.add(new ArtObject("brush",10,"camelin paint brush"));
        listProducts();

    }

    public static void listProducts(){

        for( var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

}
