package Exercise_5;

import java.util.Scanner;

public class EuclideanMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N: ");
        int N = scan.nextInt();
        System.out.println("M: ");
        int M = scan.nextInt();
        System.out.println("GCD (" + N + ","+M+") = " + GCD(N,M));
    }

    // 1 algoritm: a > b
    // 2 if b = 0, algoritm done answer = a
    // 3 else c = a%b
    // 4 a = b, b = c and do step 2,3,4 until a || b = 0
    public static int GCD(int N, int M) {
        N = Math.abs(N); // avoid negative answers
        M = Math.abs(M);
        if(M == 0){ // step 2
            return N;
        } else if (N == 0){ // step 2
            return M;
        } else if(N > M){ // step 1
            while (M!= 0){ // step 2,3,4 all over while m!= 0
                int c = N % M;
                N = M;
                M = c;
            }
            return N; // when M = 0, the answer is N
        } else{
            while (N != 0){ // step 2,3,4 all over until N =0
                int c = M%N;
                M = N;
                N = c;
            }
            return M; // when N = 0, the answer is M
        }
    }
}
