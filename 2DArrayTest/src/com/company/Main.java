package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] a = new int[1][2];
	int spiral = 1;
	int minCol = 0;
	int maxCol = 0;
	int row = -1;
	int col = -1;

	for(int i = minCol; i < a.length; i++){
        System.out.println("This is i");
	    for(int x = row; x < a[i].length; x++){
	       // a[i][x] = i * x;
           // System.out.println(a[i][x]);
            System.out.println("This is x");
        }

    }
//
//        for(int i = maxCol; i < a[i].length; i++){
//            for(int x = col; x < a.length; x++){
//                a[i][x] = i * x;
//                System.out.print(a[i][x] + "\t");
//            }
//            System.out.println("" + "\n");
//        }

    }
}
