package time;

import java.util.Random;

public class Exercise_7_integer {
    public static void main(String[] args) {
        int[] randomInts = new int[80100]; // create an array with the size of 80 100

        Random rand = new Random();
        for (int i = 0; i <randomInts.length ; i++) { // generate random ints and add them to array
            randomInts[i] = rand.nextInt(100000000);
        }
        System.gc();
        long beforeInt = System.currentTimeMillis(); // we save current time (before test execution)
        for (int i = 1; i < randomInts.length; i++) { // for each element in the array
            int storage = randomInts[i]; // we store the current value
            int j = i - 1;
            while (j >= 0 && randomInts[j] > storage) { // while j is bigger or equal to 0 and the element at pos j
                randomInts[j + 1] = randomInts[j];      // is larger than the stored, we move the elements to the left
                j--;    // decrease j.
            }
            randomInts[j + 1] = storage; // when the while-loop is done, we put the stored element at the empty pos.
        }
        long afterInt = System.currentTimeMillis(); // we save current time (after test execution)
        System.gc();
        long totalInt = afterInt - beforeInt; // calculate the total time it took to execute the test
        System.out.println("Time for ints: "+ totalInt); // print the total-time to see how long it took
    }
}
