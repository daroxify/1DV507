package count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount1Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Word> hash = new HashSet<>();
        TreeSet<Word> tree = new TreeSet<>();
        File file = new File("C:\\Users\\Enida A\\Desktop\\words.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String stringWord = scanner.next();
            Word word = new Word(stringWord);
            hash.add(word);
            tree.add(word);
        }
        Iterator<Word> treeIt = tree.iterator();
        while (treeIt.hasNext()) {
            System.out.println(treeIt.next());
        }

        System.out.println("hash size: "+hash.size());
        System.out.println("tree size: "+tree.size());
    }
}
