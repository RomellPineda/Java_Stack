import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
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

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
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
        for(String element : names) {
            if(element.length() > 5) {
                longer.add(element);
            }
        }
        // Alternative:
        // for(int i = 0; i < names.size(); i++) {
        //     if(names.get(i).length() > 5){
        //         longer.add(names.get(i));
        //     }
        // }
        return longer;
    }

    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    public void alphabet() {
        ArrayList<Character> alpha = new ArrayList<Character>();
        alpha.add('a');
        alpha.add('b');
        alpha.add('c');
        alpha.add('d');
        alpha.add('e');
        alpha.add('f');
        alpha.add('g');
        alpha.add('h');
        alpha.add('i');
        alpha.add('j');
        alpha.add('k');
        alpha.add('l');
        alpha.add('m');
        alpha.add('n');
        alpha.add('o');
        alpha.add('p');
        alpha.add('q');
        alpha.add('r');
        alpha.add('s');
        alpha.add('t');
        alpha.add('u');
        alpha.add('v');
        alpha.add('w');
        alpha.add('x');
        alpha.add('y');
        alpha.add('z');
        System.out.println(alpha);
        Collections.shuffle(alpha);
        System.out.println(alpha);
        System.out.println(alpha.get(25));
        if (alpha.get(0) == 'a' || alpha.get(0) == 'e' || alpha.get(0) == 'i' || alpha.get(0) == 'o' || alpha.get(0) == 'u') {
            System.out.println("first char of shuffled ArrayList is a vowel");
        } else {
            System.out.println("first char of shuffled ArrayList is not a vowel");
        }
    }
}