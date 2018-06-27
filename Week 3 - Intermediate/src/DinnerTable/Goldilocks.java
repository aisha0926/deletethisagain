package DinnerTable;

import java.util.Arrays;

public class Goldilocks {
    /*
    The task falls to you: given descriptions of Goldilocks' needs and of the available porridge/chairs at the dinner table,
    tell Goldilocks which chair to sit in so the chair does not break, and the porridge is at an edible temperature.
     */

    public static void main(String[] args) {
        int[][] a = {
                {180, 20},
                {82,60},
        };

        print(a);

    }

    public static void print(int mat[][]){
        for(int[] row: mat){
            System.out.println(Arrays.toString(row));
        }
    }

}
