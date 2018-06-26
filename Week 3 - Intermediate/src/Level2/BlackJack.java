package Level2;

public class BlackJack {
    public static void main(String[] args) {

        System.out.println(Jack(23,23));
    }
    private static int Jack(int one, int two){
        if(one > two && one <=  21){
            return one;
        } else if(one < two && two <= 21){
            return two;
        } else if(one == two){
            if(one >= 22 && two >= 22){
                return 0;
            }
        }
            return 0;
    }
}
