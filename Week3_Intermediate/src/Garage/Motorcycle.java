package Garage;

public class Motorcycle extends Vehicle{


    public Motorcycle(int id){
        super(id);

    }

    public Motorcycle(int id, String model, String colour){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(VehicleType.ECONOMY);
    }

}
