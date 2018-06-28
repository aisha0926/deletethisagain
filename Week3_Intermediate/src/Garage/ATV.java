package Garage;

public class ATV extends Vehicle {


    public ATV(int id){
        super(id);

    }

    public ATV(int id, String model, String colour, String type){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(type);
    }
}
