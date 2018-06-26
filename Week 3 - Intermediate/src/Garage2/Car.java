package Garage2;

public class Car extends Vehicle {

    public Car(int id){
        this.setColour("Red");
        this.setModel("Fiesta");
        this.setName("Ford");
        this.setPlateNumber(id);
        this.setSeat(4);
    }

    public Car(int id, String name, String model, String colour){
        this.setColour(colour);
        this.setModel(model);
        this.setName(name);
        this.setPlateNumber(id);
        this.setSeat(4);
    }
}
