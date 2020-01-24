import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AcceptanceTests {

  /*
  3

  1x2
  13x
  02x

  ...
  ...
  ...

  1..
  ...
  ...

  1..
  ..x
  ...

  "Defeat"
   */

  /*
  2

  x2
  2x

  ..
  ..

  .2
  ..

  .2
  2.

  "Victory"
   */


    public void twoByTwoVictory() {
        //ask player what difficulty they want
        //player selects two
        //make minesweeper game with 2x2 board
        //display hidden board
        //player makes move (1,2)
        //display board with move revealed
        //player makes move (2,1)
        //display board with move revealed
        //display revealed board
        //victory message "You win!"

        int difficulty = 2;

        List<Coordinates> minesToPlace = Arrays.asList(new Coordinates(1,1), new Coordinates(2,2));

        MinePlacer predictableMinePlacer = new PredictableMinePlacer(minesToPlace);

        Minesweeper minesweeper = new Minesweeper(difficulty, predictableMinePlacer);
        boolean canPlay = minesweeper.isVictorious();
        String initialMinefield = minesweeper.display();
        minesweeper.selectSquare(new Coordinates(1,2));
        String minefieldAfterFirstMove = minesweeper.display();
        minesweeper.selectSquare(new Coordinates(2,1));
        String minefieldAfterSecondMove = minesweeper.display();
        boolean isGameOver = minesweeper.isVictorious();

        Assert.assertTrue(canPlay);
        Assert.assertEquals("..\n.." , initialMinefield);
        Assert.assertEquals(".2\n.." , minefieldAfterFirstMove);
        Assert.assertEquals("x2\n2x" , minefieldAfterSecondMove);
        Assert.assertTrue(isGameOver);

    }
}