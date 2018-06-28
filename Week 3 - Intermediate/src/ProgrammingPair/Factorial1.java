package ProgrammingPair;

public class Factorial1 {
    public static void main(String[] args) {
        int input = 120;

        for(int i = 0; i < input; i++){
            if(i>0) {
                input /= i;
                break;
            }
        }
        System.out.println(input);


    }
}
