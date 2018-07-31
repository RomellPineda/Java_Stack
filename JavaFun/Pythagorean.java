import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(double a, double b) {
        double squared = Math.pow(a, 2) + Math.pow(b, 2);
        double hyp = Math.sqrt(squared);
        return hyp;
    }
}
