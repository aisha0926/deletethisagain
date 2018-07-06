public class Main {

    static int c = 0;

    public static void main(String[] args) {

        System.out.println("\n" + multiply(33,  -5));

    }

    private static int multiply(int a, int b){

        if(b==0){
            return 0;
        }
        if (b<0){

            return -multiply(a, -b);

        }
        if (b>0){

            c = (a + multiply(a, b-1));
            return c;

        }
        return -1;

    }

}
