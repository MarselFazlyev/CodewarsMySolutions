import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = new Random().nextInt(10);
        String b = convert(a);
        System.out.printf("Это строка %s", b);
    }

    private static String convert(int a) {
        return Integer.toString(a);
    }
}
