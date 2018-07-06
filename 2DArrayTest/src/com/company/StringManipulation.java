package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class StringManipulation {

    public static void main(String[] args) {
        /*
           Identifying unique characters and print them
         */
        String s1 = "This this potato";
        String s2 = "This potato this";
        ArrayList<Character> words = new ArrayList<>();

        ArrayList<Character> words3 = new ArrayList<>();
        //char a,b;

        for(int i = 0; i< s1.length(); i++){
            for(int x = 0; x < s2.length(); x++){
                if((s1.charAt(i)) == (s2.charAt(x)) ){
                    words.add(s1.charAt(i));

                }
            }
        }



            for(char vv: words){
                if(words3.contains(vv)){

                }else{

                    words3.add(vv);
                }

            }

//        Iterator<Character> it = words.iterator();
//       while(it.hasNext()) {
//
//           for (char cc : words2) {
//
//               char x = it.next();
//
//               if (x == cc) {
//
//                   it.remove();
//               }
//
//           }
//       }
           for(char dd: words3){
               System.out.println(dd);
           }






//            iterator<Character> it = words.iterator();
//            for(int i = 0; i< words.size()-1; i++){
//                for(int x = 0; x < words.size()-1; x++){
//                    if(i != x){
//                        while (((Iterator) it).hasNext()) {
//
//                        }
//                    }
//                    if(words.get(i).equals(words2.get(x))){
//                        words.iterator().remove(words.get(i));
//                    }
//                }
//            }





    }
}
