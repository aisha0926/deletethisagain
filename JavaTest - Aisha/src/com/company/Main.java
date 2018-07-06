package com.company;

public class Main {

    public static void main(String[] args) {
        String a= "xxxbreadjambreadxxx";
        String[] words = a.split("bread");

        for(int i = 0; i < a.length(); i++){
            System.out.println(words[i]);
        }

    }

}
