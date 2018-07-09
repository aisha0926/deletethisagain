public class UniqueSum {

    public static int unique(int a, int b, int c){
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
