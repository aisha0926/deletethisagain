package Spiral_Numbers;

public class Spiral {

    private int index;
    private int minColumn;
    private int minRow;
    private int maxColumn;
    private int maxRow;
    private int size;

    private int [] [] spiral1;

    public Spiral(int index, int minColumn, int minRow, int maxColumn, int maxRow, int size) {
        this.index = index;
        this.minColumn = minColumn;
        this.minRow = minRow;
        this.maxColumn = maxColumn;
        this.maxRow = maxRow;
        this.size = size;
        spiral1 = new int[size][size];
    }

    public void spiralise(){

        while(index <= Math.pow(size, 2)){

            for(int i = minColumn; i <= maxColumn; i++) {

                spiral1[minRow][i] = index;
                index++;
            }
            for (int i = minRow + 1; i <= maxRow; i++){

                spiral1[i][maxColumn] = index;
                index++;

            }
            for (int i = maxColumn - 1; i >= minColumn; i--){

                spiral1[maxRow][i] = index;
                index++;

            }
            for (int i = maxRow - 1; i >= minRow+1; i--){

                spiral1[i][minColumn] = index;
                index++;

            }

            this.minColumn++;
            this.minRow++;
            this.maxColumn--;
            this.maxRow--;

        }

        for (int i = 0; i < spiral1.length; i++) {

            for (int j = 0; j < spiral1.length; j++) {
                System.out.print(spiral1[i][j]+ "\t");
            }

            System.out.println();
        }

    }
}
