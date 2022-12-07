package Data;

public class Main {
    public static void main(String[] args) {
        try {
            Data.checkLogin("524iok_Llkjhbjkhkjhl");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        Data.checkData("login", "pass_word9", "pass_word9");

    }


}

