package Garage2;

import java.util.ArrayList;

/*
    This method will have an arraylist containing different types of vehicles
    It will also calculate how much they cost, depending on what type of vehicle they are
 */

public class Garage {

    private ArrayList<Vehicle> vehicles;
    public static final String HIGH_END = "High End";
    public static final String ECONOMY = "Economy";

    public Garage(){
        vehicles = new ArrayList<Vehicle>();
    }

    protected void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    protected void removeVehicle(int v){
        for(Vehicle ve: vehicles){
            if(ve.getPlateNumber() == v){
                vehicles.remove(ve);
            }
            billCalulation();
        }
    }

    protected double billCalulation(){
        double bill = 0.0;
        if(vehicles.equals(HIGH_END)){
            bill += 200;
        } else if(vehicles.equals(ECONOMY)){
            bill += 90;
        }
        System.out.println("Total bill is: "+bill);

        return bill;
    }

}
