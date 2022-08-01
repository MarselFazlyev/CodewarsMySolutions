import java.util.Arrays;

public class MultiplyAllMassiveElements {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        System.out.println(multiply(x));
    }
    private static int multiply(int[] x){
        return Arrays.stream(x).reduce(1,(a,b)->a*b);
    }

}
