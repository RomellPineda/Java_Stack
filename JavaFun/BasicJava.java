import java.util.ArrayList;
public class BasicJava {

    // Write a method that prints all the numbers from 1 to 255.
    public void count255() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    // Write a method that prints all the odd numbers from 1 to 255.
    public void odds() {
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public void sum() {
        int count = 0;
        for(int i = 0; i < 256; i++) {
            count += i;
            String yield = String.format("New number: %d Sum: %d", i, count);
            System.out.println(yield);
        }
    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public void contains(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void ave(int[] arr) {
        double sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        double ave = sum / arr.length;
        System.out.println(ave);
    }

    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255]
    public void oddarr() {
        ArrayList<Object> array = new ArrayList<Object>();
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                array.add(i);
            }
        }
        System.out.println(array);
    }

    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public void greaterY(int[] arr, int Y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > Y) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4]
    public void square(int[] arr) {
        ArrayList<Object> arrayx= new ArrayList<Object>();
        for(int val : arr){
            arrayx.add(val * val);
        }
        System.out.println(arrayx);
    }

    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void noNeg(int[] arr) {
        ArrayList<Object> array= new ArrayList<Object>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                array.add(arr[i]);
            }
            else {
                array.add(0);
            }
        }
        System.out.println(array);
    }

    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public ArrayList maxMinAve(int[] arr) {
        ArrayList<Object> array= new ArrayList<Object>();
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int ave = sum / arr.length;
        array.add(max);
        array.add(min);
        array.add(ave);
        return array;
    }

    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public ArrayList shift(int[] arr) {
        ArrayList<Object> array= new ArrayList<Object>();
        for(int i = 0; i < arr.length - 1; i++) {
          arr[i] = arr[i + 1];
          array.add(arr[i]);
        }
        array.add(0);
        return array;
    }
}
