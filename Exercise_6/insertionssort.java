package Exercise_6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.util.Arrays;

public class insertionssort {
    private SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

    @Test
    public void testInsertArray(){
        int[] test = {3,2,-1};
        int[] actual = {-1,2,3};
        int[] testMany =         {-12,-10,-87,12,87,56,20,84,67,10,20,30,-40,10};
        int[] testManyExpected = {-87,-40,-12,-10,10,10,12,20,20,30,56,67,84,87};
        int[] test1 = {1};
        int[] testEmpty = {};

        SortingAlgorithms.insertionSort(test);
        for (int i = 0; i < test.length-1 ; i++) {
            assertTrue(test[i] <= test[i+1]); // check if sorted
        }
        assertEquals(Arrays.toString(testManyExpected), Arrays.toString(SortingAlgorithms.insertionSort(testMany)));
        assertEquals("[]", Arrays.toString(SortingAlgorithms.insertionSort(testEmpty)));
        assertEquals("[1]", Arrays.toString(SortingAlgorithms.insertionSort(test1)));
        assertEquals(Arrays.toString(actual), Arrays.toString(SortingAlgorithms.insertionSort(test))); // check if method works
    }

    @Test
    public void testInsertString(){
        String[] test = {"hej", "då", "enida", "eenida"};
        String[] expected = {"då", "eenida","enida" ,"hej"};
        String[] testEmpty = {""};
        String[] testMany = {"hej", "då", "java", "class", "finished", "school", "åmål", "hello", "bye!", "yes", "no"};
        String[] testManyExpected = {"bye!","class","då","finished","hej","hello","java","no","school","yes","åmål"};
        assertEquals(Arrays.toString(expected), Arrays.toString(SortingAlgorithms.insertionSort(test, String::compareTo)));
        assertEquals("[]", Arrays.toString(SortingAlgorithms.insertionSort(testEmpty, String::compareTo)));
        assertEquals(Arrays.toString(testManyExpected), Arrays.toString(SortingAlgorithms.insertionSort(testMany, String::compareTo)));
    }

}
