import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class ReverseTest {
    @Test
    public void test1(){
        // setup
        String input = "door";
        String expected = "rood";

        // invoke
        String actual = Reverse.reverse(input);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // setup
        String input = "level";
        String expected = "level";

        // invoke
        String actual = Reverse.reverse(input);

        // analyze
        assertEquals(expected, actual);
    }
    
}
