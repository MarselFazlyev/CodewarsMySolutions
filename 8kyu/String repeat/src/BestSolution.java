public class BestSolution {
    public static void main(String[] args) {
        String a = "mama";
        System.out.println(repeatString(3, a));

    }

    private static String repeatString(int repeat, String string) {
        return string.repeat(repeat);

    }
}
