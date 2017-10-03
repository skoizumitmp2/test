 /**
 * Junit5
 */
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LeapYearTest{

    @Test
    public void testCase1() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            LeapYear.check(0);
        });
        assertEquals("Argument Error YEAR", exception.getMessage());
    }

    @Test
    public void testCase2() {
        assertEquals(true, LeapYear.check(2000));
    }

    @Test
    public void testCase3() {
        assertEquals(true, LeapYear.check(2016));
    }

    @Test
    public void testCase4() {
        assertEquals(false, LeapYear.check(2100));
    }

    @Test
    public void testCase5() {
        assertEquals(false, LeapYear.check(3000));
    }

    @Test
    public void testCase6() {
        assertEquals(false, LeapYear.check(89));
    }

    @Test
    public void testCase7() {
        assertEquals(true, LeapYear.check(4000));
    }
}
