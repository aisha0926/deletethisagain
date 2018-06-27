package Calculator;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.calc(4, 2, 8);
    }

    private double calc(double a, double b, double c) {

        double result = 0;

        if (a + b == c) {
            System.out.println("a" + "+" + "b "+ "= " +c);
        }
        if (a + c == b) {
            System.out.println(b);
        }
        if (b + c == a) {

            System.out.println(a);
        }
        if (a * b == c) {

            System.out.println(c);

        }
        if (a * c == b) {
            System.out.println(b);
        }
        if (b * c == a) {
            System.out.println(a);

        }
        if (a / b == c) {
            System.out.println(c);

        }
        if (a / c == b) {

            System.out.println(b);

        }
        if (c / a == b) {
            System.out.println(b);
        }
        if (b / a == c) {

            System.out.println(c);
        }
        if (c / b == a) {

            System.out.println(a);

        }
        if (b / c == a) {
            System.out.println(a);

        }
        if(a - b == c){
            System.out.println(c);
        }
        if(c - a == b){
            System.out.println(b);
        }
        if(b - c == a){
            System.out.println(a);
        }


        return result;
    }
}
