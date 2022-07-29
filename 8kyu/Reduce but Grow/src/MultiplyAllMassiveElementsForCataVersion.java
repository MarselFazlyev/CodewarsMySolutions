import java.util.Arrays;

public class MultiplyAllMassiveElementsForCataVersion {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        System.out.println(multiply(x));
    }
    private static int multiply(int[] x){
        int total = 1;
        for (int a:x) {
            total*=a;
        }
        return total;

    }

}
