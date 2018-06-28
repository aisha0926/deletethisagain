package Garage;

import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> val = new ArrayList<>();

    void addVehicle(Vehicle a){
        val.add(a);
    }

    void removeVehicle(Vehicle a){

            val.remove(a);

    }

    public void displayIt(){
        for(Vehicle x: val){
            System.out.println(x.toString());
        }

    }

    boolean fixingVehicle(){
        return true;
    }

    protected int calc(String a){
        int bill = 0;
        if(a.equals(VehicleType.ECONOMY)){
            bill += 100;
        } else if(a.equals(VehicleType.HIGH_END)){
            bill += 300;
        }
        return bill;
    }
}
