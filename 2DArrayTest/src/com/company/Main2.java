package com.company;

public class Main2 {
    private int result = 0;
    private int tracker = 0;


    public int multiply(int a, int b){

        if(a == 0 || b == 0 ) {
            return 0;
        }
            if(a>0 && b >0){
                result += b;
                tracker += 1;
                if(a == tracker){
                    return result;
                } else{
                    multiply(a,b);
                }
        }
         else if(a<0){
            result -= b;
            tracker += 1;
                if(-a == tracker){
                    return result;
                } else{
                    multiply(a,b);
                }
        }
         else  {
            result -= a;
            tracker += 1;
                if(-b == tracker){
                    return result;
                } else{
                    multiply(a,b);
                }
        }
        return  result;
    }

    public static void main(String[] args) {
        Main2 a = new Main2();
        System.out.println(a.multiply(6,7));
    }



}
