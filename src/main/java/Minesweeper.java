public class Minesweeper {

  private MinePlacer board;
  private IO io;

  public Minesweeper(IO io, MinePlacer minePlacer) {
    this.board = minePlacer;
    this.io = io;
  }

  public String[][] getBoard() {
    return board.generateBoard(io.readDifficulty());
  }
}
