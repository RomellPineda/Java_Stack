import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public void build() {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(3);
        digits.add(5);
        digits.add(1);
        digits.add(2);
        digits.add(7);
        digits.add(9);
        digits.add(8);
        digits.add(13);
        digits.add(25);
        digits.add(32);

        Collections.sort(digits);
        System.out.println(digits);
        Collections.shuffle(digits);
        System.out.println(digits);

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(99));

        int sum = 0;
        ArrayList<Integer> greater = new ArrayList<Integer>();
        for(int i = 0; i < digits.size(); i++){
            sum += digits.get(i);
            if(digits.get(i) > 10){
                greater.add(digits.get(i));
            }
        }
        System.out.println(sum);
        System.out.println(greater);

    }

    public ArrayList names() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        names.add("Sacagawea");
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> longer = new ArrayList<String>();
        // for(String element : names) {
        //     if(element.length() > 5) {
        //         longer.add(element);
        //     }
        // }
        // return longer;
        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).length() > 5){
                longer.add(names.get(i));
            }
        }
        return longer;
    }
}