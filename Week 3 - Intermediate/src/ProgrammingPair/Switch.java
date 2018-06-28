package ProgrammingPair;

public class Switch {


    /*
    Switch statement is good when you want to test multiple matches.
    More efficient way instead of using if and else statement.
    However, it can only test char and int values
    e.g.

    switch(<case you want to test>){
    case <value 1, this can be in a type of int or String>:
        <statements. This is where the codes will be executed, e.g. print out days etc>
    case 2: etc.
    default:
        Message
    }
     */

    public static void main(String[] args) {
        int a =  5, b = 10;

        switch(b % 2){
            case 0:
                System.out.println(0);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Nothing");
        }

    }

}
