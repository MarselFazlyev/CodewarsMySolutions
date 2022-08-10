import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveTen {
    public static void main(String[] args) {
        String test = "Hello Bro";
        moveTen(test);
    }

    private static String moveTen(String s) {
        int minIndex = 97;
        int maxIndex = 122;
        if (s.length() == 0) throw new RuntimeException("Пустая строка!");
        int[] alphabetics = IntStream.rangeClosed(minIndex, maxIndex).toArray();
        StringBuilder result = new StringBuilder();
        List<Character> chars = s.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
        System.out.println(chars);
        for (int i = 0; i < chars.size(); i++) {
            if (!Character.isWhitespace(chars.get(i)) && chars.get(i) < minIndex || chars.get(i) > maxIndex)
                throw new RuntimeException("Введены некорректные значения слова" +
                        " (не английский алфавит)!!!");
            int charIndex = chars.get(i) + 10;
            int temp = charIndex - alphabetics[alphabetics.length - 1];
            if (temp > 0) chars.set(i, (char) alphabetics[temp - 1]);
            else if ((Character.isWhitespace(chars.get(i)))) chars.set(i, ' ');
            else chars.set(i, (char) charIndex);
            result.append(chars.get(i));
        }
        System.out.println(result);
        return result.toString();
    }

}
