package People;

import java.util.ArrayList;
import java.util.Scanner;

public class People {

    Person a;
    Person b;
    Person c;
    ArrayList<Person> test = new ArrayList<Person>();

    public static void main(String[] args) {

        People accessing = new People();

        accessing.a = new Person("Aisha", 10, "Consultant");
        accessing.b = new Person("Peter", 21, "Tester");
        accessing.c = new Person("Daniel", 25, "Dev");

        accessing.test.add(accessing.a);
        accessing.test.add(accessing.b);
        accessing.test.add(accessing.c);

        System.out.println(accessing.searchIt());

//       for(Object object: accessing.test ){
//           System.out.println(object);
//       }

    }

    private String searchIt() {
        String s = "";
        System.out.println("Enter name: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        for (Person p : test) {
            if (p.name.contains(line)) {
                String a = " ";
                s = p.name + a + p.age + a + p.jobTitle;
            }
        }

        return s;
    }


}
