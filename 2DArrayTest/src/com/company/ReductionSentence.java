package com.company;

import java.util.Scanner;

public class ReductionSentence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String[] words = A.toLowerCase().split("");
        /* Enter your code here. Print output to STDOUT. */
        String a = "";
        String b = "";



        for(int i=0; i<words.length; i++){
            if(i == 0){
                a = words[i];
                System.out.println(a);
            }
            if(i == words.length-1){
                b = words[i];
                System.out.println(b);
            }
        }


//        for(int i=0; i<A.length()-1; i++){
//            if((A.charAt(i)) == (A.length())){
//                System.out.println(A.charAt(i));
//            }
//        }
    }

}
