import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveTen {
    public static void main(String[] args) {
        String test = "";
        moveTen(test);
        int[] alphabetics = new int[122 - 97];

    }

    private static String moveTen(String s) {
        if (s.isEmpty()) throw new RuntimeException("Пустая строка!");
        int[] alphabetics = IntStream.rangeClosed(97, 122).toArray();
        StringBuilder result = new StringBuilder();
        List<Character> chars = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
        System.out.println(chars);
        for (int i = 0; i < chars.size(); i++) {
            int charIndex = chars.get(i) + 10;
            int temp = charIndex - alphabetics[alphabetics.length - 1];
            if (temp > 0) chars.set(i, (char) alphabetics[temp - 1]);
            else chars.set(i, (char) charIndex);
            result.append(chars.get(i));
        }
        System.out.println(result);
        return result.toString();
    }

}
