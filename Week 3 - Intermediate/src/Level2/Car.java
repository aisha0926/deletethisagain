package Level2;

public class Car extends Vehicle{

    public static void main(String[] args) {
        Car a = new Car();
        a.colours();
        a.seat();
        a.name();
        a.type();
        a.wheels();
    }

    @Override
    public void colours(){

    }

    @Override
    public void wheels() {
        System.out.println(4);
    }

    @Override
    public void name() {
        System.out.println("Test");
    }

    @Override
    public void type() {
        System.out.println("Test2");
    }

    @Override
    public void seat() {
        System.out.println(4);
    }

}
