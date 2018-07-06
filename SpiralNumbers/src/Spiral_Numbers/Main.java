package Spiral_Numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");

        int a = 0;

        try{
            a = sc.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("IDIOT, ENTER AN INTEGER LIKE I SAID!");
        }

        Spiral spiral = new Spiral(1, 0, 0, (a-1), (a-1), a);

        spiral.spiralise();

    }

}
