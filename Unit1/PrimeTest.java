import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class PrimeTest {
    @Test 
    public void test55(){
        // setup
        int n = 55;
        boolean expected = false;

        // invoke
        boolean actual = Prime.isPrime(n);

        // analyze
        assertEquals(expected, actual);
    }

    @Test 
    public void test11(){
        // setup
        int n = 11;
        boolean expected = true;

        // invoke
        boolean actual = Prime.isPrime(n);

        // analyze
        assertEquals(expected, actual);
    } 
}
