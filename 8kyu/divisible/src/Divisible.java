public class Divisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(30L,2L, 6L));
    }

    private static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

}
