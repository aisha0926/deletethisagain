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

    public void calculateLoop(){
        int bill = 0;

        for (Vehicle v : val){

            if(v.getClass().getSimpleName().equals("Car")){

                //do something

                Car tempCar;

                tempCar = (Car) v;

             //   System.out.println(tempCar.numberOfDoors);
                bill += 100;
            //    System.out.println(bill);

            } else if (v.getClass().getSimpleName().equals("ATV")){
                ATV tempATV;
                tempATV = (ATV) v;
                    bill += 50;
             //   System.out.println(bill);
              //  System.out.println(tempATV);

            }

            System.out.println(bill);

        }


    }



    protected int calc(VehicleType a){
        int bill = 0;
        if(a.equals(VehicleType.ECONOMY)){
            bill += 100;
        } else if(a.equals(VehicleType.HIGH_END)){
            bill += 300;
        }
        return bill;
    }
}
