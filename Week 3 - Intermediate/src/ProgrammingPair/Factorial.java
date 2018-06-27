package ProgrammingPair;

public class Factorial {

    public static void main(String[] args) {


        float f = 120f;
        System.out.println(calculate(f));

    }

    public static String calculate(float f){
        int i = 1;
        float answer = 0;
        do{
            if(i >= f){
                break;
            }
            i++;
            answer = f/i;
            if(answer == 1){
                return (i + "!");
            } else{
                f = answer;
            }

        }while(f > i);

        return "no factorial found.";
    }

}
