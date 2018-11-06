package objectexample;

public class UseCars {

    public static void main(String[] args) {
        Car c = new Car("Ford Fiesta", 9);
//        Car c;
//        c = new Car();
//        c.setModel("Ford Fiesta");
//        c.setFuelLevel(-99_999);

        System.out.println("Car c has " + c.getFuelLevel() + " fueld");

        Car c2 = new Car("Toyota Echo", 8);

//        Car c2 = new Car();
//        c2.setModel("Toyota Echo");
//        c2.setFuelLevel(8);

        Car c3 = new Car();
        System.out.println("Car c3 is " + c3.asText());

        System.out.println(c.asText());
        System.out.println(c2.asText());

        Car moreFuel;
        moreFuel = Car.hasMoreFuel(c, c2);
        System.out.println("the car with more fuel is a " + moreFuel.getModel());
//        System.out.println(Car.asText(c));
//        System.out.println(Car.asText(c2));

        System.out.println("Car c has more fuel than car c2? " + c.iHaveMoreFuelThan(c2));
        System.out.println("Car c2 has more fuel than car c? " + c2.iHaveMoreFuelThan(c));

        System.out.println("Max design speed of cars is " + Car.MAX_DESIGN_SPEED);


    }
}
