package Challenge_Abstratction;

import java.lang.reflect.Type;

public class ArtObject extends ProductForSale{

    public ArtObject(String description, double price, String type) {
        super(description, price, type);
    }

    @Override
    public void showDetails() {

        System.out.println("TYPE :" + type );
        System.out.printf("Price is $%6.2f %n ", price);
        System.out.println(description);

    }
}
