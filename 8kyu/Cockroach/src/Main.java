public class Main {
    public static void main(String[] args) {
        System.out.println(cockroachSpeed(3.8));
    }

    private static int cockroachSpeed(double x) {
        return (int) Math.floor(x * 3.6);
    }
}
