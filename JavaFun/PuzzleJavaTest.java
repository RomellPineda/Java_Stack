public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava what = new PuzzleJava();
        what.build();

        PuzzleJava name = new PuzzleJava();
        System.out.println(name.names());

        PuzzleJava alpha = new PuzzleJava();
        alpha.alphabet();
    }
}