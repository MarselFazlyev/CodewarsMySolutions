import java.util.stream.IntStream;

public class RawSumOddNumbers {
    public static void main(String[] args) {
        int testNumber = 10;
        System.out.println(rowSumOddNumbers(testNumber));
    }

    private static int rowSumOddNumbers(int n) {
        if (n <= 0) throw new RuntimeException("Номер строки должен быть положительным целым числом!");
        int numbersBelow = (n - 1) * n / 2;
         /* арифметическая прогрессия подсчитывает общее количество предыдущих
         элементов строки n по формуле a = a(a+1)/2 ( сколько надо их пропустить в стриме */
        return IntStream.iterate(1, x -> x + 2)
                .skip(numbersBelow)
                .limit(n).sum();
    }

}


