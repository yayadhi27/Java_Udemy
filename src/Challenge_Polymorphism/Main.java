package Challenge_Polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Red Ferrari");
        runRace(car1);

        System.out.println("-----------------------------------");

        Car car2 = new GasPowerdCar("Hundai", 20, 6);
        runRace(car2);

        System.out.println("--------------------------------------");

        Car car3 = new ElectricCar("Tesla",30,4000);
        runRace(car3);

    }

    public static  void runRace (Car car){

        car.startEngine();
        car.drive();

    }




}
