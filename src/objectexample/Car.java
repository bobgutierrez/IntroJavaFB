package objectexample;

public class Car {
    public static final int MAX_DESIGN_SPEED = 120;
    private String model;
    private int fuelLevel;

    public Car() {
//        this.model = "Unknown";
//        this.fuelLevel = 0;
    }

    public Car(String model, int fuelLevel) {
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

    public void setFuelLevel(int fuel) {
        if (fuel >= 0 && fuel <= 100){
            this.fuelLevel = fuel;
        } else {
            throw new IllegalArgumentException("Bad fuel value " + fuel);
        }
    }

    public void driveMiles(int miles) {
        fuelLevel -= miles / 20;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean iHaveMoreFuelThan(Car other) {
        return this.fuelLevel >= other.fuelLevel;
    }

    public static Car hasMoreFuel(Car c1, Car c2, Car c3) {
        Car rv = c1;
        if (c2.fuelLevel > rv.fuelLevel) rv = c2;
        if (c3.fuelLevel > rv.fuelLevel) rv = c3;
        return rv;
    }

    public static Car hasMoreFuel(Car c1, Car c2) {
//        System.out.println(this); // NO "this" in a static method...
//        return c1.fuelLevel >= c2.fuelLevel ? c1 : c2;
        Car rv;
        if (c1.fuelLevel >= c2.fuelLevel) rv = c1;
        else rv = c2;
        return rv;
    }

    public String asText() {
        return "Car " + this.model + " has " + this.fuelLevel + " fuel";

//        int model = 9;
//        return "Car " + this.model + " has " + fuelLevel + " fuel";
    }
//    public static String asText(Car c) {
//        return "Car " + c.model + " has " + c.fuelLevel + " fuel";
//    }

    public static int getSpeedLimit(String road) {
        if (road.startsWith("HWY")) return 65;
        else return 55;
    }
}


// Car.asText(thisCar)...
// c.asText()
// c2.asText()

