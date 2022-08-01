public class ConvertAStringToANumber {
    public static void main(String[] args) {
        String test = "123";
        try {
            System.out.println(stringToNumber(test));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int stringToNumber(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

}
