package Transport;

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

    public static Integer validateWagons(Integer value) {
        if (value == null) {
            return 1;
        } else {
            return value;
        }
    }

    public static String validateCategory(String value) {
        if (value == "B" || value == "C" || value == "D") {
            return value;
        } else {
            return "default";
        }
    }


}
