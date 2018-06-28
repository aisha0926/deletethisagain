package Garage;

public abstract class Vehicle {
    private int id;
    private String model;
    private String colour;
    private String type;


    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Vehicle(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return (id + " " + model + " " + colour);
    }



}
