import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {
        int[] array = new Random(1).ints(10, 1, 5).toArray();
        System.out.println(Arrays.toString(array));
        calculateAverage(array);

    }

    private static double calculateAverage(int[] array) {
        System.out.println(Arrays.stream(array).average().getAsDouble());
        return Arrays.stream(array).average().orElse(0);
    }
}
