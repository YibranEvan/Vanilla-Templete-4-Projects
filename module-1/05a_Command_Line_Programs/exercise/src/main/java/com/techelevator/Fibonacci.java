package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {

/// start your loop on 1 instead on 0
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter an number: ");
		String numberInput = userInput.nextLine();
		int number = Integer.parseInt(numberInput);

		int a = 0, b = 1;

		for (int i = 1; i <= number; i++) {


			System.out.print(a + ", ");
			int nextNumber = a + b;
			a = b;
			b = nextNumber;

			if (a > number) {
				break;

			}
		}
	}
}








