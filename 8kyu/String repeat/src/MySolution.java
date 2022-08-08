public class MySolution {
    public static void main(String[] args) {
        String a = "mama";
        System.out.println(repeatStr(3, a));

    }

    private static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }




}
