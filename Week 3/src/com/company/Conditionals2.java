package com.company;

public class Conditionals2 {
    public static void main(String[] args) {
        System.out.println(Add(4,3, false));
    }

    protected static int Add(int first, int second, boolean t) {

        if (first == 0) {
            return second;
        } else if (second == 0) {
            return first;
        }
        if (t == true) {
            return first + second;
        } else {
            return first * second;
        }
    }

}

