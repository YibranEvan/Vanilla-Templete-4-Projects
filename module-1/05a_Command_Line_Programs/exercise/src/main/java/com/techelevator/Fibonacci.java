package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {

	//	Scanner userInput = new Scanner(System.in);
	//	System.out.print("Please enter a number: ");
	//	String fibonacciInput = userInput.nextLine();
	//	int fibonacci = Integer.parseInt(fibonacciInput);
		//if ()
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");






		int initial = 0;
		int addInitial = 1;
		int keepInitial = 0;

		int topNumber = input.nextInt();
		input.nextLine();

		System.out.print(0 + " ");

		for (int nextNum = 1; nextNum <= topNumber;) {

			System.out.print(nextNum + " ");

			keepInitial = initial;
			initial = nextNum;
			nextNum= nextNum + keepInitial;
		}
	}
}
