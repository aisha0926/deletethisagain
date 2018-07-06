public class Grid {

    public void grid(){
        int[][] a = new int[10][10];

        for(int i = 0; i < a.length-1; i++){
            for(int x = 1; x < a[i].length-1; x++){
                a[i][x] = i * x;
                // System.out.println(a[i][x]);
            }

        }

        for(int i = 0; i < a.length-1; i++){
            for(int x = 0; x < a[i].length-1; x++){
                a[i][x] = i * x;
                System.out.print(a[i][x] + "\t");
            }
            System.out.println("" + "\n");
        }

    }


}
