import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class CollatzTest {
    @Test
    public void test5(){
        int n = 5;
        String expected = "5 16 8 4 2 1";

        // invoke
        String actual = Collatz.sequence(n);

        // analyze
        assertEquals(expected, actual);
    }
}
