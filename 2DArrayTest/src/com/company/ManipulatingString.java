package com.company;

public class ManipulatingString {
    public static void main(String[] args) {
        String s1 = "Innocent super smoothie energise";
        String s2 = "Energise strawberry cherry guarana & flax";
        String[] a = s1.split("");
        String[] b = s2.split("");
        String c = "", d = "";

        for(int i = 0; i < a.length-1; i++){
            for(int x = 0; x < b.length-1; i++){
                if(a == b){
                    c = a[i];
                    System.out.println(c);
                }
            }
        }
    }
}
