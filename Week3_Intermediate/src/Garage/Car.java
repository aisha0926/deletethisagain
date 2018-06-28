package Garage;

public class Car extends Vehicle {



    String model;

//    public Car(int id){
//        super(id);
//
//    }

    public Car(int id, String model, String colour, String type){
        super(id);
        this.setModel(model);
        this.setColour(colour);
        this.setType(type);
    }



}
