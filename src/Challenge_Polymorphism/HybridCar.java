package Challenge_Polymorphism;

public class HybridCar extends Car{
    private double avgKmPerLiter;
    private int batterSize;
    private int cylinder = 6;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int batterSize, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterSize = batterSize;
        this.cylinder = cylinder;
    }


}
