import org.junit.Assert;
import org.junit.Test;

import main.Rectangle;

public class RectangleTest {
    @Test
    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle(10, 30);
        Assert.assertEquals(rectangle.getArea(), 300);
    }
}
