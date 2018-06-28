package People;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        People a = new People("Al", 20, "Consultant");
        People b = new People("Aisha", 10, "IT");
        People c = new People("Daniel", 2, "Boxer");
        People sunnyD = new People("Adam", 21, "Hitman");
        People d = new People("Sayed", 20, "Chief");

        ArrayList<People> val = new ArrayList<>();
        val.add(a);
        val.add(b);
        val.add(c);
        val.add(sunnyD);
        val.add(d);



        System.out.println("Enter name to search");
        Scanner scan = new Scanner(System.in);
        String line = scan.next();

        for(People x: val){
                if(x.getName().contains(line)){
                    System.out.println(x.toString());

                }
    }
}

}
