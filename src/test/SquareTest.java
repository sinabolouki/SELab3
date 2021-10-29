import main.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void calculateAreaTest() {
        Square square = new Square(30);
        Assert.assertEquals(square.getArea(), 900, 0.001);
    }

    @Test
    public void changeSideTest() {
        Square square = new Square(30);
        square.changeSide(20);
        Assert.assertEquals(square.getArea(), 400, 0.001);
    }
}
