package Level2;

public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(Unique(3,3,3));
    }

    private static int Unique(int a, int b, int c){
        if(a != b && b != c && c!= a){
            return a+b+c;
        } else if(a == b && c != b){
            return c;
        } else if(b == c && a != b){
            return a;
        } else if(c == a && b != a){
            return b;
        } else
            return 0;
    }
}
