package ProgrammingPair;

public class Foreach_Loop {

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};

        //Foreach loop can only be used for array or handling selections in the array
        // for(<insert data type of the array> <variable name>: <array name/collection name>)
        for(int x: i){
            System.out.println(x);
        }
    }
}
