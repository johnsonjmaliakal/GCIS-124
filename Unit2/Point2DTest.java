import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class Point2DTest {
    
    @Test
    public void test1(){
        // setup
        Point2D p1 = new Point2D(9.0,6.2);
        Point2D p2 = new Point2D(4.3,6.2);
        boolean expected = false;

        // invoke
        boolean actual = p1.equals(p2);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // setup
        Point2D p1 = new Point2D(4.1,7.02);
        Point2D p2 = new Point2D(4.1,7.02);
        boolean expected = true;

        // invoke
        boolean actual = p1.equals(p2);

        // analyze
        assertEquals(expected, actual);
    }
    
}
