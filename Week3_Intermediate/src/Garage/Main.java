package Garage;

import People.Garage1;

public class Main {



    public static void main(String[] args) {
        Garage a = new Garage();

        Car c1 = new Car(2,"Matt","Matt", "Car");

      //  System.out.println(c1.numberOfDoors);
        ATV atv = new ATV(1);


        a.addVehicle(atv);
        a.addVehicle(new Car(1, "Hundai", "Blue", "ATV"));
        a.addVehicle(new Car(2,"Matt","Matt", "Car"));
        System.out.println(a.calc());

    }
}
