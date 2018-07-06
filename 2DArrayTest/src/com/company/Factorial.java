package com.company;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    static int factorial(int x){
        if(x == 0){
            return 1;
        }

        if(x>0){
            return x*factorial(x-1);
        }

        return 1;
    }
}
