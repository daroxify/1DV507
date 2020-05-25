package time;

public class Exercise_6_LONG {
    public static void main(String[] args) {
        StringBuilder longBUF = new StringBuilder();
        String longStr = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; // string containing 80 a's
        System.gc();
        int count = 0;
        long beforeLongBUF = System.currentTimeMillis();
        for (int i = 0; i < 2149580 ; i++) {
            longBUF.append(longStr);
        }
        String l = longBUF.toString(); // include toString
        long afterLongBUF = System.currentTimeMillis();
        long totalLongBUF = (afterLongBUF - beforeLongBUF);
        String str = "";
        System.gc();
        long beforeLongStr = System.currentTimeMillis();
        for (int i = 0; i <3200 ; i++) {
            str = str + longStr;
        }
        long afterLongStr = System.currentTimeMillis();

        long totalLongStr = afterLongStr - beforeLongStr;
        System.gc();

        System.out.println("StringBuilder time, long string: " + totalLongBUF);
        System.out.println("Plus-operator time, long string: " + totalLongStr);
        System.out.println("StringBuilder final string length: " + longBUF.length());
        System.out.println("Plus-operator time, long string: " + str.length());
    }
}
