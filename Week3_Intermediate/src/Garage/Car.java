package Garage;

public class Car extends Vehicle {


    public Car(int id){
        super(id);

    }

    public Car(int id, String model, String colour){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(VehicleType.HIGH_END);
    }
}
