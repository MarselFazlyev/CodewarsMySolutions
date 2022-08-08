import java.util.stream.IntStream;

public class Summation {
    public static void main(String[] args) {
        sum(8);
    }

    private static int sum(int a) {
        System.out.println(IntStream.range(1, a).sum());
        return IntStream.rangeClosed(1, a).sum();
    }
}