package time;


public class Exercise_6_SHORT {
    public static void main(String[] args) {
        String str = "";
        StringBuilder buf = new StringBuilder();
        System.gc(); // garbage collection

        long beforeBUF = System.currentTimeMillis();
        for (int i = 0; i < 68300100 ; i++) {
            buf.append("a");
        }
        String s = buf.toString(); // include toString
        long afterBUF = System.currentTimeMillis();
        long totalBUF = (afterBUF - beforeBUF);

        System.gc();
        long beforeStr = System.currentTimeMillis(); // adding short strings with str = str + " "
        for (int i = 0; i < 34000; i++) {
            str = str + "a";
        }
        long afterStr = System.currentTimeMillis();

        long totalStr = afterStr - beforeStr;

        System.gc();

        System.out.println("StringBuilder time, short string: " +totalBUF);
        System.out.println("Plus-operator time, short string: " +totalStr);
        System.out.println("StringBuilder final length of short string: " + s.length());
        System.out.println("Plus-operator final length of short string: " + str.length());
        System.out.println("StringBuilder appends short string: " + 68300100);
        System.out.println("Plus-operator operations short string: " + 34000);
    }
}
