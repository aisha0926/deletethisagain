package People1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person a = new Person("Aisha", 20, "Consultant");

        ArrayList<Person> val = new ArrayList<>();
        val.add(a);

        System.out.println("Enter name to search ");
        Scanner scan = new Scanner(System.in);
        String line = scan.next();

        for(Person x: val){
            if(x.getName().contains(line)){
                System.out.println(x.toString());
            } else if(line != x.getName()){
                System.out.println("Cannot find name");
            }

        }
    }
}
