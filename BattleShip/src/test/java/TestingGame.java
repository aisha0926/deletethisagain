import static org.junit.Assert.assertArrayEquals;
import org.junit.*;

import java.util.ArrayList;

public class TestingGame {

    @Test
    public void test(){
        //Game game = new Game();
        //Setting the level to level 1
      //  game.setLevel(1);

        Grid grid = new Grid();
        //Will have a 2d Array which will contain the grid to be printed. Pre-defined grid size
        grid.grid();

        Ships boat = new Ships();
        boat.shipCount = 2;
        //x and y size of ship
        boat.setSize(1,5);
        //X and Y coordinates
        boat.location(0,1);
        //Grid location, [10][10]
        boat.attack(1,4);
        boat.setName("Name");

        //Player list
        Player player = new Player();
        player.addBoat(1, "Battleship");

    }

}
