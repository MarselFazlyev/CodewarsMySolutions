import java.util.Arrays;

public class CountByMySolution {

    public static void main(String[] args) {
        int[] testArray = countBy(3, 10);
        System.out.println(Arrays.toString(testArray));
    }

    private static int[] countBy(int x, int n) {
        final int temp = x;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            x += temp;
            array[i] = x;

        }
        return array;
    }


}
