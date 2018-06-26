package com.company;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println(Add(2,3, false));
    }

    private static int Add(int first, int second, boolean t){
        if(t==true){
            return first + second;
        } else {
            return first * second;
        }

    }
}
