import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "AGTAC";
        System.out.println(makeComplement(s));
    }

    private static String makeComplement(String dna) {
        String upperCase = dna.toUpperCase();
        return upperCase
                .chars()
                .map(x -> {
                    if (x == 'A') return 'T';
                    else if (x == 'T') return 'A';
                    else if (x == 'G') return 'C';
                    else if (x == 'C') return 'G';
                    return x;
                }).collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append).toString();

    }
}
