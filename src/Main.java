public class Main {
    public static void main(String[] args) {
        try {
                String str = check(" ");
                System.out.println(str);
        }
        catch (MyException e) {
                e.printStackTrace();
        }
    }

    public static String check (String str) throws MyException {
        if (str == null || str.isBlank() || str.isEmpty()) {
                throw new MyException ("Ошибка");
        }
        else return str;
    }
}