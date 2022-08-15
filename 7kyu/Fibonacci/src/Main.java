import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int test = 45;
        System.out.println(fib(test));
    }

    public static long fib(int n) {
        if (n <= 0 || n > 93) // n>93 вызовет перполнение типа long
            throw new IndexOutOfBoundsException("Wrong input for Nth element of Fibonacci sequence !!");
        return Stream.iterate(new int[]{0, 1}, (int[] x) -> new int[]{x[1], x[0] + x[1]})
                .skip(n - 1)
                .limit(n)
                .map(y -> y[0])
                .mapToLong(z -> (long) z)
                .findFirst().getAsLong();
    }
}
