/**
 * Junit4
 */
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;

/**
 * Junit5
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void testAdd() {
        assertEquals(3, Hello.add(1, 2));
    }
}
