package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("What is the destination file?");
		String fileDes = userInput.nextLine();

		File fileDestination = new File(fileDes);

		try(PrintWriter word = new PrintWriter(fileDestination.getAbsoluteFile())){
			for (int i =1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0){
					word.println("FizzBuzz");
				}
				else if (i % 3 == 0){
					word.println("Fizz");
				}
				else if (i % 5 == 0){
					word.println("Buzz");
				}
				else {
					word.println(i);
				}
			}
		}

        catch (FileNotFoundException e) {
			System.out.println("The file " + fileDes + " Was not found, please try again");
		}

	}

}
