package count_words;

import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class IdentifyWordsMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Enida A\\Desktop\\HistoryOfProgramming.txt");
        File newFile = new File("C:\\Users\\Enida A\\Desktop\\words.txt");

        try {
            if (file.exists()) { // if the file we read from exists:
                Scanner scan = new Scanner(file);
                FileWriter fileWriter = new FileWriter(newFile);
                PrintWriter printer = new PrintWriter(fileWriter);
                while (scan.hasNext()) {
                    String line = scan.nextLine();
                    if (!line.isEmpty()) { // with this we can remove the empty lines
                        line = noDots(line);
                        printer.print(line + " ");
                        printer.println();
                    }
                }
                printer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String noDots(String word){
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length() ; i++) {
            if(Character.isLetter(word.charAt(i))||word.charAt(i) == ' '){
                newWord.append(word.charAt(i));
            }
        }
        return newWord.toString();
    }
}
