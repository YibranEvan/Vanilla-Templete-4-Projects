package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("What is the fully qualified name of the file that should be searched?");
		String fileName = userInput.nextLine();

		System.out.print("What is the search word you are looking for?");
		String dataFile = userInput.nextLine();

		System.out.print("Should the search be case sensitive? (Y/N)");
		String caseSensitive = userInput.nextLine();

		File file = new File(fileName);
		int i = 0;

		try (Scanner fileInput = new Scanner(file)) {
			while (fileInput.hasNextLine()) {
				String lineOfInput = fileInput.nextLine();
				i++;
				if (caseSensitive.equals("Y")) {
					if (lineOfInput.contains(dataFile)) {
						System.out.println(i + ") " + lineOfInput);
					}
				} else {
					if (lineOfInput.toLowerCase().contains(dataFile.toLowerCase())) {
						System.out.println(i + ") " + lineOfInput);
					}
				}
			}
		}
		catch(FileNotFoundException e){
					System.out.println("The file was not found: " + fileName);
				}

			}

		}
