import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       System.out.println(ret("xxbreadjambreeadyy"));
      //  System.out.println(returnOneString("The"));
       // System.out.println(stringClean("yyzzza"));
       // System.out.println(fibonacci(2));
       // System.out.println(bunnyEars(4));
       // System.out.println(superBlock("jeffbert"));
    }

    public static String ret(String input) {
        String[] words = input.split("bread");
        String a = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("bread")) {
                a = words[i];
            } else {
                return "Error";
            }


        }
        return a;
    }

    public static  String returnOneString(String returning){
        ArrayList<String> s1 = new ArrayList<String>();


        for(int i = 0; i < returning.length()-1; i++){
           s1.add(returning.substring(i));
        }


        return s1.toString();
    }

    public static String stringClean(String input) {
        String logger = input;
        char d = ' ';
        ArrayList<Character> word = new ArrayList<Character>();
        ArrayList<Character> words3 = new ArrayList<Character>();
        for(int i = 0; i< input.length(); i++){
            for(int x = 0; x < logger.length(); x++){
                word.add(input.charAt(i));
            }

        }
        for(char c: word){
            if(words3.contains(c)){
            }else{
                words3.add(c);
            }
        }

//
//        for(char dd: words3){
//            d =  dd;
//        }


        return words3.toString();
    }

    public static int fibonacci(int input) {
        if(input == 0){
            return 0;
        }

        if(input>0){
            return input+fibonacci(input-1);
        }
        return -1;
    }

    public static int bunnyEars(int input) {
            int counter = input;
            int result = 0;
         if(input == 0){
             return 0;
         } else if(input > 0){
             counter--;
             result += input;
             if(input == counter){
                 return result;
             } else {
                 return bunnyEars(input);
             }

         }
        return  -1;
    }

    public static int superBlock(String str) {
        int counter = 0;
        ArrayList<Character> word = new ArrayList<Character>();
        ArrayList<Character> words3 = new ArrayList<Character>();
        for(int i = 0; i< str.length(); i++){
                word.add(str.charAt(i));
        }
        for(char c: word){
            if(words3.contains(c)){
                counter++;
            }else{
                System.out.println("Do nothing");
            }
        }

        return counter;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
