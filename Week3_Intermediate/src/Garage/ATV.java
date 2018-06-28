package Garage;

public class ATV extends Vehicle {


    public ATV(int id){
        super(id);

    }

    public ATV(int id, String model, String colour){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(VehicleType.HIGH_END);
    }
}
