package Level2;

public class TooHot {
    public static void main(String[] args) {
        System.out.println(summer(50,false));
    }

    private static boolean summer(int temp, boolean isSummer){
        if(isSummer){
            if(temp >= 60 && temp <= 100){
                return true;
            } else {
                return false;
            }
        } else {
            if(temp >= 60 && temp <= 90) {
                return true;
            }
        }
        return false;
    }
}
