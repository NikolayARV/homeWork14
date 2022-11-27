package Animals;

public class ValitUtils {
    public static String validateValues(String value) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return "default";
        } else {
            return value;
        }
    }

    public static Integer validatePrice(Integer value) {
        if (value == null) {
            return 50;
        } else {
            return value;
        }
        }
    public static Integer validateTime(Integer value) {
        if (value == null) {
            return 10;
        } else {
            return value;
        }
    }
    public static Integer validateInteger(Integer value) {
        if (value == 0) {
            return 5;
        } else {
            return value;
        }
    }
    }
