import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {

  @Test
  public void testMinesweeper() {
    IO testIO = () -> 4;

    MinePlacer testPlacer = new MinePlacer();
    new Minesweeper(testIO, testPlacer);
  }

  @Test
  public void whenDifficultyIsFourRowsEqualFour() {
    MinePlacer testPlacer = new MinePlacer();

    String[][] board = testPlacer.generateBoard(4);

    int actual = board.length;
    int expected = 4;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void whenDifficultyIsFourColumnsEqualFour() {
    MinePlacer testPlacer = new MinePlacer();

    String[][] board = testPlacer.generateBoard(4);

    int actual = board[0].length;
    int expected = 4;
    Assert.assertEquals(expected, actual);
  }
}