public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
    private static  String boolToWord(boolean b) {
            return b ? "Yes" : "No";
        }
}
