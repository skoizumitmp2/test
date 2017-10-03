//import java.lnag.Exception

public class LeapYear {
    public static boolean check(int year) {
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
