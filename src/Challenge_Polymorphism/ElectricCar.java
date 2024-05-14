package Challenge_Polymorphism;

public class ElectricCar extends Car{
    private double avgKmPerLiter;
    private int batterySIze;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter, int batterySIze) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySIze = batterySIze;
    }
}
