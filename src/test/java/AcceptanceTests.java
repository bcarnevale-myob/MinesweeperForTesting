import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void twoByTwoVictory() {

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