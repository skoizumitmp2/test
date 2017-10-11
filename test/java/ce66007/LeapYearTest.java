 /**
 * Junit5
 */
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import se.LeapYear;
import ce66007.LeapYearImpl;
public class LeapYearTest{
    private LeapYear lp;

    @BeforeEach
    public void init() {
        lp = new LeapYearImpl();
    }

    @Test
    public void testCase1() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            lp.isLeapYear(0);
        });
        assertEquals("Argument Error YEAR", exception.getMessage());
    }

    @Test
    public void testCase2() {
         assertAll("positive range",
                () -> {
                    assertFalse(lp.isLeapYear(1));
                },
                () -> {
                    assertFalse(lp.isLeapYear(Integer.MAX_VALUE));
                }
        );
    }

    @Test
    public void testCase3() {
        assertAll("negative range",
                () -> {
                    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
                        lp.isLeapYear(-1);
                    });
                    assertEquals("Argument Error YEAR", exception.getMessage());
                },
                () -> {
                    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
                        lp.isLeapYear(Integer.MIN_VALUE);
                    });
                    assertEquals("Argument Error YEAR", exception.getMessage());
                }
         );
    }

    @Test
    public void testCase4() {
        assertTrue(lp.isLeapYear(4));
    }

    @Test
    public void testCase5() {
        assertFalse(lp.isLeapYear(100));
    }

    @Test
    public void testCase6() {
        assertTrue(lp.isLeapYear(400));
    }

    @Test
    public void testCase7() {
        assertTrue(lp.isLeapYear(4000));
    }
}
