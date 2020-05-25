package Exercise_3;

import java.util.Arrays;

public class PascalMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalRow(7)));
    }

    public static int[] pascalRow(int row) {
        int[] pasTri;
        if (row == 0) {
            pasTri = new int[]{1};
            return pasTri;
        } else if (row == 1) {
            pasTri = new int[]{1, 1};
            return pasTri;
        } else {
            int[] prev = {1,1}; // start prev is always {1,1}
            for (int i = 2 ; i <=row ; i++) { // next row starts at n=2
                pasTri = new int[i+1]; // the size is row+1
                pasTri[0] = 1; // first element is 1
                for (int j = 1; j < i ; j++) {
                    pasTri[j] = pascalRow(i-1)[j-1] + pascalRow(i-1)[j];
                }
                pasTri[i] = 1; // last element = 1
                prev = pasTri; // previous now becomes current.
            }
            return prev;
        }
    }
}
