package test;

public class Test {

    //member  1. static 2. instance

    public static void main(String[] shad){


        int x=120;

        //We want to find factorial of x. 5*4*3*2*1
        int factorial = 1;
        for(int i = 1; i <= x; i++){
            factorial = factorial/ i;

        }
        System.out.println(factorial(x));
    }

    public static int factorial(int x){
  if(x <= 1){
            return 1; ///terinating condition
        } else
            return x* factorial(x - 1);

    }

}
