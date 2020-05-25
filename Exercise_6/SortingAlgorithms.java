package Exercise_6;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, -1};
        String[] b = {"hej", "då", "enida", "java", "ååmål", "åmål"};
        Comparator<String> alphaOrder = (s1, s2) -> s2.compareTo(s1);

        System.out.println(Arrays.toString(insertionSort(b, alphaOrder)));
        System.out.println(Arrays.toString(insertionSort(a)));
    }


    public static int[] insertionSort(int[] in) {
        int[] newarr;
        newarr = in;
        for (int i = 1; i < in.length; i++) {
            int storage = newarr[i];
            int j = i - 1;
            while (j >= 0 && newarr[j] > storage) {
                newarr[j + 1] = newarr[j];
                j--;
            }
            newarr[j + 1] = storage;
        }
        return newarr;
    }

    /*public static int[] mergeSort(int[] in)     // VG Exercise
    {
        return new int[0];
    }
*/
    public static String[] insertionSort(String[] in, Comparator<String> c) {
        String[] newIn = Arrays.copyOf(in, in.length); // copy array
        for (int i = 0; i < newIn.length; i++) {
            String storage = newIn[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if(c.compare(storage, newIn[j]) <= 0){ // compare the two, if it's less than zero they are in the right place
                    break; // so we break
                }
                newIn[j+1] = newIn[j]; // else we replace them
            }
            newIn[j+1] = storage; // insert storage at pos j+1

        }
        return newIn; // return the new sorted array
        }

    /*
    public String[] mergeSort(String[] in, Comparator<String> c)   // VG Exercise
    {
        return new String[0];
    }

     */
    }
