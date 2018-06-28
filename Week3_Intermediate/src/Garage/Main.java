package Garage;

public class Main {
    public static void main(String[] args) {
        Garage a = new Garage();
        a.addVehicle(new Car(1, "Hundai", "Blue"));
        System.out.println(a.calc("ECONOMY"));
        a.displayIt();
    }
}
