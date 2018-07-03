package Garage2;

public class Motorcycle extends Vehicle {

    public Motorcycle(int id){
        this.setColour("Blue");
        this.setModel(Garage.HIGH_END);
        this.setName("BMW");
        this.setPlateNumber(id);
        this.setSeat(4);
    }

    public Motorcycle(int id, String name, String model, String colour){
        this.setColour(colour);
        this.setModel(model);
        this.setName(name);
        this.setPlateNumber(id);
        this.setSeat(4);
    }

}



