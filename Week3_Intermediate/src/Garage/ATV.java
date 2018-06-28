package Garage;

public class ATV extends Vehicle {
    String model;


    public ATV(int id){
        super(id);

    }

    public ATV(int id, String model, String colour, String type){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(type);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }



}
