package Garage2;

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage();

        Car a = new Car(2);

        System.out.println(a);

        g.billCalulation();
        g.toString();
    }
}
