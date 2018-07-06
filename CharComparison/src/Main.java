import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s1 = "Aisha is short";
        String s2 = "Adam is weird";
        char a;
        char b;
        ArrayList<Character> store = new ArrayList<>();
        ArrayList<Character> store2 = new ArrayList<>();
        boolean existing = false;

        for (int i = 0; i<s1.length(); i++){

            for (int j = 0; j<s2.length(); j++){

                if ((a = s1.charAt(i)) == (b = s2.charAt(j))){

                  //  System.out.println(a);
                  store.add(a);



                }

            }



        }

        for(char aa: store){

          if(store2.contains(aa)){


          } else{

              store2.add(aa);
          }

        }

        for(char cc: store2){

            System.out.println(cc);
        }
    }

}
