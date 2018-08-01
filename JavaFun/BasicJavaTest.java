public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava count = new BasicJava();
        count.count255();

        BasicJava what = new BasicJava();
        what.odds();

        BasicJava sum = new BasicJava();
        sum.sum();
        
        BasicJava thatArray = new BasicJava();
        int[] array1 = {1,3,5,7,9,13};
        thatArray.contains(array1);

        BasicJava whoMax = new BasicJava();
        int[] array2 = {-12, -3, -5, -7, -1};
        whoMax.max(array2);

        BasicJava average = new BasicJava();
        int[] array3 = {1,3,5,7,9,13};
        average.ave(array3);

        BasicJava oddarray = new BasicJava();
        oddarray.oddarr();

        BasicJava greater = new BasicJava();
        int[] array4 = {1, 3, 5, 7};
        int y = 3;
        greater.greaterY(array4, y);
        
        BasicJava squared = new BasicJava();
        int[] array5 = {1, 5, 10, -2};
        squared.square(array5);

        BasicJava noNegs = new BasicJava();
        int[] array6 = {1, 5, 10, -2};
        noNegs.noNeg(array6);

        BasicJava maxMinAve = new BasicJava();
        int[] array7 = {1, 5, 10, -2};
        System.out.println(maxMinAve.maxMinAve(array7));

        BasicJava shift = new BasicJava();
        int[] array8 = {1, 5, 10, -2};
        System.out.println(shift.shift(array8));
    }
}