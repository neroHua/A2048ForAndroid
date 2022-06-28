package nero.hua.a2048forandroid;

import org.junit.Assert;
import org.junit.Test;

public class GameDataAndLogicTest {

    @Test
    public void testRightCase01() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase02() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase03() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase04() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase05() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase06() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testRightCase07() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.right();

        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase01() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase02() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase03() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase04() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase05() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase06() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.left();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testLeftCase07() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.left();

        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase01() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase02() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase03() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase04() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase05() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase06() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.up();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testUpCase07() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.up();

        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase01() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase02() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase03() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase04() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase05() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase06() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(2);

        gameDataAndLogic.down();

        Assert.assertEquals(4, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testDownCase07() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(0);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(0);

        gameDataAndLogic.down();

        Assert.assertEquals(2, gameDataAndLogic.cardArray[0][0].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][1].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][2].getNumber());
        Assert.assertEquals(0, gameDataAndLogic.cardArray[0][3].getNumber());
    }

    @Test
    public void testCheckComplete() {
        GameDataAndLogic gameDataAndLogic = new GameDataAndLogic(null);

        gameDataAndLogic.cleanGame();
        Assert.assertFalse(gameDataAndLogic.checkComplete());

        gameDataAndLogic.cardArray[0][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[0][1].setNumberAndLabel(4);
        gameDataAndLogic.cardArray[0][2].setNumberAndLabel(8);
        gameDataAndLogic.cardArray[0][3].setNumberAndLabel(16);

        gameDataAndLogic.cardArray[1][0].setNumberAndLabel(16);
        gameDataAndLogic.cardArray[1][1].setNumberAndLabel(8);
        gameDataAndLogic.cardArray[1][2].setNumberAndLabel(4);
        gameDataAndLogic.cardArray[1][3].setNumberAndLabel(2);

        gameDataAndLogic.cardArray[2][0].setNumberAndLabel(2);
        gameDataAndLogic.cardArray[2][1].setNumberAndLabel(4);
        gameDataAndLogic.cardArray[2][2].setNumberAndLabel(8);
        gameDataAndLogic.cardArray[2][3].setNumberAndLabel(16);

        gameDataAndLogic.cardArray[3][0].setNumberAndLabel(16);
        gameDataAndLogic.cardArray[3][1].setNumberAndLabel(8);
        gameDataAndLogic.cardArray[3][2].setNumberAndLabel(4);
        gameDataAndLogic.cardArray[3][3].setNumberAndLabel(2);

        Assert.assertTrue(gameDataAndLogic.checkComplete());
    }
}
