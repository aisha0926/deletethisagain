package Garage;

import com.sun.tools.doclint.Entity;

public class Car extends Vehicle {

    //Default Constructor
    public Car(int id){

        super(id);
        this.setColour("Red");
        this.setName("Honda");
        this.setType(VehicleType.FOUR_WHEELER);
        this.setSeats(4);
        this.setWheels(4);

    }
//Parameterized Constructor
    public Car(int id, String name,String color){
        super(id);
        this.setColour(color);
        this.setName(name);
        this.setType(VehicleType.FOUR_WHEELER);
        this.setSeats(4);
        this.setWheels(4);

    }
}
