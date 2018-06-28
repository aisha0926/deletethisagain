package Garage;

import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> val = new ArrayList<>();
    int repair = 0;

    protected boolean addVehicle(Vehicle a){
       // val.add(a);
        return val.add(a);
    }

    protected void removeVehicle(Vehicle a){
        val.remove(a);
    }

    protected double calc(){
        double bill = 0;

       for(Vehicle x: val){
           if(x instanceof Car){
               bill += 100;
           } else if(x instanceof ATV){
               bill += 50;
           }
       }
       return bill;
    }

}
