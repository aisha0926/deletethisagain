package Garage2;

/*
    Class which will be inherited by multiple classes.
    Vehicle have different model, colour, seat number, name, plate number
 */
public abstract class Vehicle {


    private String model;
    private String colour;
    private int seat;
    private String name;
    private int plateNumber;

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

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String toString(){
        return plateNumber + " " + name + " " + model;
    }

}
