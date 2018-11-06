package objectexample;

public class RoadTrip {
    public static void main(String[] args) {
        Car c = new Car("Ford Fiesta", 80);
        System.out.println(c);

        c.driveMiles(200);
        System.out.println(c);

        c.addFuel(20);
        System.out.println(c);
    }
}
