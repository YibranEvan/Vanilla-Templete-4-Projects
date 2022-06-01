package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		String lengthInput = userInput.nextLine();
		int length = Integer.parseInt(lengthInput);
		System.out.print("Is the measurement in (m)eter, or (f)eet?: ");
		String scaleInput = userInput.nextLine();

		if ("m".equals(scaleInput)) {
			int feetLength = (int) (length * 3.2808399);
			System.out.println(length + "m is " + feetLength + "f");
		} else if ("f".equals(scaleInput)) {
			int meterLength = (int) (length * 0.3048);
			System.out.println(length + "f is " + meterLength + "m");
		}else {
			System.out.println("Error! input must be m or f!");

		}

		}






		}

