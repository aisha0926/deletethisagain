package Garage;

import Garage.Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(int id){
        super(id);
        this.setColour("Blue");
        this.setName("Royal");
        this.setType(VehicleType.TWO_WHEELER);
        this.setSeats(2);
        this.setWheels(2);

    }
    //Parameterized Constructor
    public Motorcycle(int id, String name,String color){
        super(id);
        this.setColour(color);
        this.setName(name);
        this.setType(VehicleType.TWO_WHEELER);
        this.setSeats(2);
        this.setWheels(2);


    }
}
