package Challenge_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer(true,20);
        System.out.println(p1);
        p1.addToner(20);
        p1.printPages(40);
        System.out.println(p1);

        System.out.println("-----------------------------------------");

        Printer p2 = new Printer(false, 50);
        System.out.println(p2);
        p2.addToner(80);
        p2.printPages(40);
        System.out.println(p2);
    }
}
