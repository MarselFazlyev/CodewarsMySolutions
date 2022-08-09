import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "Люблю почаще бродить по чаще!";
        System.out.printf("Работает метод со стримом: результат %d%n",shortestWord(a));
        System.out.printf("Работает метод без стрима: результат %d", shortestWordWithoutStream(a));
    }

    private static int shortestWord(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt((x) -> x.length())
                .min()
                .getAsInt();
    }

    private static int shortestWordWithoutStream(String s) {
        int minSize = Integer.MAX_VALUE;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (minSize > words[i].length()) minSize = words[i].length();
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() < minSize) minSize = words[j].length();
            }
        }
        return minSize;
    }
}
