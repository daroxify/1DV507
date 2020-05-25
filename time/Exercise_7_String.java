package time;

import java.util.Comparator;
import java.util.Random;

public class Exercise_7_String {
    public static void main(String[] args) {
        Comparator<String> c = (s1,s2) -> s2.compareTo(s1);
        String[] randStrings = new String[22000];

        for (int i = 0; i <randStrings.length ; i++) { // Fill the array with random strings
            randStrings[i] = generateString();
        }
        System.gc();
        long beforeStr = System.currentTimeMillis();
        for (int i = 0; i < randStrings.length; i++) {
            String storage = randStrings[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if(storage.compareTo(randStrings[j]) <= 0){
                    break; // so we break
                }
                randStrings[j + 1] = randStrings[j]; // else we replace them
            }
            randStrings[j + 1] = storage; // insert storage at pos j+1
        }
        long afterStr = System.currentTimeMillis();
        System.gc();
        long totalStr = afterStr - beforeStr;
        System.out.println("Time for str: " + totalStr);
    }
    private static String generateString(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        StringBuilder text = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i <10 ; i++) {
            text.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return text.toString();
    }
}
