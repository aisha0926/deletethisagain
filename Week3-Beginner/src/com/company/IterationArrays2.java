package com.company;

public class IterationArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 1; i < arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }
        for(int x = 1; x < arr.length; x++){
            arr[x] = x*10;
            System.out.println(arr[x]);
        }
    }
}
