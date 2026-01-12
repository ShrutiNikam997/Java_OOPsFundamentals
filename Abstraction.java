import java.util.*;

abstract class Vehicle {

    abstract void start();

    int Price;
    String VehicleType;

    void fuelType() {
        System.out.println("Uses Fuel");
    }

    void Display() {
        System.out.println("Vehicle Type : " + VehicleType);
        System.out.println(" Vehicle Price :" + Price);

    }

}

class Start extends Vehicle {
    void start() {
        System.out.println("Vehicle starts with Keys");
    }
}

interface Payment {
    void UPI();

    void Cash();
}

class PayMethod implements Payment {
    public void UPI() {
        System.out.println("Pays Online");
    }

    public void Cash() {
        System.out.println("Paid by Cash");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Vehicle Car = new Start();
        Car.VehicleType = "Car";
        Car.Price = 500000;
        Car.fuelType();
        Car.start();
        Car.Display();

        Payment p1 = new PayMethod();
        p1.Cash();

        Vehicle Bike = new Start();
        Bike.VehicleType = "Bike";
        Bike.Price = 200000;
        Bike.fuelType();
        Bike.start();
        Bike.Display();

        Payment p2 = new PayMethod();
        p2.UPI();

    }
}