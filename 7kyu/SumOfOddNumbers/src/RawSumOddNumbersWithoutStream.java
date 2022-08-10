import java.util.stream.IntStream;

public class RawSumOddNumbersWithoutStream {
    public static void main(String[] args) {
        int testNumber = 10;
        System.out.println(rowSumOddNumbers(testNumber));
    }

    private static int rowSumOddNumbers(int n) {
        if (n <= 0) throw new RuntimeException("Номер строки должен быть положительным целым числом!");
        return n*n*n;
    }
}


