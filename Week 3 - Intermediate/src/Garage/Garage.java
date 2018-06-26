package Garage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public void removeVehicle(int vehicleId){

        Vehicle tobeRemovedVehicle= null;
        for(Vehicle v: vehicles){

            if(v.getId()==vehicleId){

                tobeRemovedVehicle=v;
                break;

            }


        }
        vehicles.remove(tobeRemovedVehicle);
    }

    public void removeVehicle(String type){

        Vehicle tobeRemovedVehicle= null;
        for(Vehicle v: vehicles){

            if(v.getType().equals(type)){

                tobeRemovedVehicle=v;


            }


        }
        vehicles.remove(tobeRemovedVehicle);
    }

    public void displayTotalBill(){
        double total = 0.0;
        for(Vehicle v: vehicles){
            total = total + v.getBill();
        }
        System.out.println("Total bill is: " + total);
    }

}
