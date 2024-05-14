package Challenge_Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){

        System.out.println("Car --> car is started");

    }

    public void drive(){

        System.out.println("Car ---> Driving , type is " + getClass().getSimpleName());
        runEngine();

    }

    protected void runEngine(){
        System.out.println("Car ---> Enginee is running");

    }

}
