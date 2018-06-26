package Garage;

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage();

        Car c1= new Car(1);
        Car c2= new Car(2,"Audi", "Blue");


        System.out.println(c1);
        System.out.println(c2);


        g.addVehicle(c1);
        g.addVehicle(c2);
        g.addVehicle(new Motorcycle(3));
        g.addVehicle(new Motorcycle(4, "BMW", "Red"));

        g.displayTotalBill();

        g.removeVehicle(3);
        g.displayTotalBill();
    }
}
