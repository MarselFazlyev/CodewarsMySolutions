import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new Random().ints(10, 0, 10).toArray();
        System.out.println(Arrays.toString(testArray));
        System.out.println(oddOrEven(testArray));
    }

    public static String oddOrEven(int[] array) {
        return "This sum of elements is " + (Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd");
    }
}
