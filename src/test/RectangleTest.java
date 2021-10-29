import org.junit.Assert;
import org.junit.Test;

import main.Rectangle;

public class RectangleTest {
    @Test
    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle(10, 30);
        Assert.assertEquals(rectangle.getArea(), 300, 0.001);
    }

    @Test
    public void changeHeightTest() {
        Rectangle rectangle = new Rectangle(10, 30);
        rectangle.setHeight(20);
        Assert.assertEquals(rectangle.getArea(), 600, 0.001);
    }

    @Test
    public void changeWidthTest() {
        Rectangle rectangle = new Rectangle(10, 30);
        rectangle.setWidth(40);
        Assert.assertEquals(rectangle.getArea(), 400, 0.001);
    }
}
