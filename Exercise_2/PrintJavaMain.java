package Exercise_2;

import java.io.File;
import java.io.FileNotFoundException;

public class PrintJavaMain {
    public static void main(String[] args) {
        try {
            File startDir = new File("C:\\programmering\\Java-courses\\ea223qi_assign2\\src\\main");
            if(!startDir.exists()){
                throw new FileNotFoundException();
            } else
            printAllJavaFiles(startDir);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    private static int count = 0;

    public static void printAllJavaFiles(File directory) throws FileNotFoundException {
            if (directory.isDirectory()) {
                System.out.println((++count) + directory.getName());
                File[] subs = directory.listFiles();
                for (File f : subs) {
                    printAllJavaFiles(f);
                }
            } else if (directory.getName().endsWith(".java")) {
                System.out.println("\t" + ++count + directory.getName());
            }
    }
}

