public class Marbies {
    public static void main(String[] args) {
        System.out.println(guessBlue(5, 5, 2, 3));
    }

    private static double guessBlue(int startBlueMorbies, int startRedMorbies, int pulledOutBlueMorbies, int pulledOutRedMorbies) {
        int blueMorbiesIn = startBlueMorbies - pulledOutBlueMorbies;
        int redMorbiesIn = startRedMorbies - pulledOutRedMorbies;
        return (double) blueMorbiesIn / (blueMorbiesIn + redMorbiesIn);
    }
}
