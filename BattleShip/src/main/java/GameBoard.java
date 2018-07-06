import java.util.ArrayList;

public class GameBoard {
    ArrayList<Ships> shipArray = new ArrayList<Ships>();
     int[] level = {1,2};

    public GameBoard(int[] level) {
        this.level = level;
    }

    public void addShip(Ships a){
        shipArray.add(a);
    }



}
