package Data;

import java.util.Objects;
import java.util.regex.Pattern;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public static boolean checkData(String login, String password, String confirmPassword) {
        try {
            login = checkLogin(login);
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка");
            System.out.println(e.getMessage());
        }
        try {
            password = checkPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка");
            System.out.println(e.getMessage());
        }

        return true;

        }
        public static String checkLogin (String login) throws WrongLoginException{
            if (Pattern.matches("[a-zA-Z_0-9]{1,20}", login)) {
                return login;
            } else {
                throw new WrongLoginException ("неправильный логин");
            }

        }

        public static String checkPassword (String password, String confirmPassword) throws WrongPasswordException{
            if (Pattern.matches("[a-zA-Z_0-9]{1,20}", password) && password.equals(confirmPassword)) {
                return password;
            } else {
                throw new WrongPasswordException("неправильный пароль");
            }
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof Data)) return false;
            Data data = (Data) o;
            return Objects.equals(password, data.password) && Objects.equals(confirmPassword, data.confirmPassword);
        }

        @Override
        public int hashCode () {
            return Objects.hash(password, confirmPassword);
        }
    }


