import java.util.ArrayList;

public class Ships {
    int shipCount;
    String[] type = {"Battleship", "Patrol boat", "Destroyer"};
    int locationX;
    int locationY;

    int currentX;
    int currentY;

    public Ships(int locX, int locY){
        this.locationX = locX;
        this.locationY = locY;
    }

    public Ships(String type){

    }

    public Ships(){

    }


    public void tracker(){
        currentX = locationX;
        currentY = locationY;
    }

    public void typGetter(){

    }



}
