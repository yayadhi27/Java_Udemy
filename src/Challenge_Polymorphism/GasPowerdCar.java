package Challenge_Polymorphism;

public class GasPowerdCar extends Car {
    private double avgKmPerCharge;
    private int cylinder = 6;

    public GasPowerdCar(String description) {
        super(description);
    }

    public GasPowerdCar(String description, double avgKmPerCharge, int cylinder) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinder = cylinder;
    }

    @Override
    public void drive() {
        System.out.println("Gas ------> driving gas car");
        runEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Gas ------> Gas car started");
    }
}
