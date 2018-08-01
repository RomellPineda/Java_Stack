public class StringManipulationTest {
    public static void main(String[] args) {
        StringManipulation alpha = new StringManipulation();
        String str = alpha.trimAndConcat("   Hello   ", "   World   ");
        System.out.println(str);

        StringManipulation bravo = new StringManipulation();
        char letter = 'o';
        Integer a = bravo.getIndexOrNull("Coding", letter);
        Integer b = bravo.getIndexOrNull("Hello World", letter);
        Integer c = bravo.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        StringManipulation charlie = new StringManipulation();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer aa = charlie.getIndexOrNull(word, subString);
        Integer bb = charlie.getIndexOrNull(word, notSubString);
        System.out.println(aa);
        System.out.println(bb);

        StringManipulation delta = new StringManipulation();
        String wurd = delta.concatSubstring("Hello", 1, 2, "world");
        System.out.println(wurd);
    }
}