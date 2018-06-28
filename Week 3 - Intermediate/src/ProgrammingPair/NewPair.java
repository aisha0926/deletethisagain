package ProgrammingPair;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NewPair {


    public static void main(String[] args) {

        int[] arr = new int[100];
        int[] st = {1, 21, 31, 41, 51, 61, 71, 81, 91};
        int[] rd = {3, 23, 33, 43, 53, 63, 73, 83, 93};

        System.out.println("Input value: ");
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
       //     for (int x = 0; x < st.length; x++) {
                if (arr[i] != line) {
//                    if (arr[i] == st[x]) {
//                        System.out.println(arr[i] + "st");


//                        if (arr[i] == st[0]) {
//                            //System.out.println(arr[i] + "st");
//                        } else {
                            System.out.println(arr[i] + "rd");
//                        }
      //              }
                    //      }
                }


            }
        }
    }



