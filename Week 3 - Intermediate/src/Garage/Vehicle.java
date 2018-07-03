package Garage;

public abstract class Vehicle {

    private String colour;
    private String name;
    private String type;
    private int wheels;
    private int seats;
    final private int id;

    public double getBill(){

        double bill=0.0;

        if(type.equals(VehicleType.FOUR_WHEELER)){

            bill = 100;
        } else if(type.equals(VehicleType.TWO_WHEELER)){
            bill = 50;
        }


        return bill;
    }


    public Vehicle(int id){

        this.id=id;
    }

    public int getId() {
        return id;
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    public String toString(){
        return id+" , "+name+" , "+colour+" ," ;
    }



}
