package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.print("What is the replacement word?");
        String wordReplace = userInput.nextLine();

        System.out.print("What is the source file?");
        String srcFile = userInput.nextLine();

        System.out.print("What is the destination file?");
        String fileDes = userInput.nextLine();

        File sourceFile = new File(srcFile);
        File fileDestination = new File(fileDes);


        try (Scanner fileInput = new Scanner(sourceFile.getAbsoluteFile()); PrintWriter dataOutput = new PrintWriter(fileDestination.getAbsoluteFile())) {
            while (fileInput.hasNextLine()) {
                String lineOfInput = fileInput.nextLine();
                dataOutput.println(lineOfInput.replaceAll(searchWord, wordReplace));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("The file " + srcFile + " Was not found, please try again");
        }
    }
}
