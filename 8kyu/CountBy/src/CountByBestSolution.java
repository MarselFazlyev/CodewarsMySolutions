import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CountByBestSolution {
    public static void main(String[] args) {
        int[] testArray = countBy(3, 10);
        System.out.println(Arrays.toString(testArray));
    }

    private static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1,n)
                .map(i->i*x)
                .toArray();
    }


}
