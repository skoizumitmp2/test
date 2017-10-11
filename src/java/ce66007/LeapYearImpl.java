
package ce66007;
import se.LeapYear;

/**
 * うるう年
 */

public class LeapYearImpl implements LeapYear {

    @Override
    public boolean isLeapYear(int year) {
        if (0 >= year) {
            throw new IllegalArgumentException("Argument Error YEAR");
        }

        if (0 != (year % 400) && 0 == (year % 100)) {
            return false;
        }

        if (0 == (year % 4)) {
            return true;
        }

        return false;
    }
}
