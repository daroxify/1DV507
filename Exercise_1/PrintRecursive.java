package Exercise_1;

public class PrintRecursive {
    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println(); // Line break
        printReverse(str, 0);
    }


    public static void print(String str, int pos) {
        if (pos != str.length()) {
            System.out.print(str.charAt(pos));
            print(str, pos + 1);
        }
    }

    public static void printReverse(String str, int pos) {
        if(pos != str.length()){
            printReverse(str, pos+1);
            System.out.print(str.charAt(pos));
        }
    }

}