package count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount2Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Enida A\\Desktop\\words.txt");
            Scanner scan = new Scanner(file);
            HashWordSet hash = new HashWordSet();
            TreeWordSet tree = new TreeWordSet();

            while (scan.hasNext()){
                String readWord = scan.next();
                Word word = new Word(readWord);
                hash.add(word);
                tree.add(word);
            }
            System.out.println("Tree to string: "+ tree.toString()); // the tree in alphabetical order
            System.out.println("Hash to string: " +hash.toString());
            System.out.println("Words in hashSet: " + hash.size());
            System.out.println("Words in treeSet: " +tree.size());
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
