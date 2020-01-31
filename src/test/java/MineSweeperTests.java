import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MineSweeperTests {
    @Test
    public void canCreateAMineFieldOfDifficultyTwo() {
        MinePlacer nullMinePlacer = new PredictableMinePlacer(new ArrayList<>());
        Minesweeper minesweeper = new Minesweeper(2, nullMinePlacer);

        Assert.assertEquals("..\n..", minesweeper.display());
    }
}
