package com.techelevator;

//import Scanner here
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

			//user interaction
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");

		//nextLine() to answer any question from System.out.print
		String tempInput = userInput.nextLine();

		//transfer tempInput into INT variable
		int temperature = Integer.parseInt(tempInput);

		System.out.print("Is the temperature in (C)elsius, or (F)arenheit?: ");
		String scaleInput = userInput.nextLine();


		// temperatureCelsius = (temperatureFarenheit - 32) / 1.8 (if)
		// temperatureFarenheit = temperatureCelsius * 1.8 + 32 (else if)
		// throw an error statement (else)
		// .equals('varible goes here')
		// 58F is 14C.
		if ("F".equals(scaleInput)) {
			int celsiusTemperature = (int) ((temperature - 32) / 1.8);
			System.out.println(temperature + "F is " + celsiusTemperature + "C.");
		} else if ("C".equals(scaleInput)) {
			int farenheitTemperature = (int) ((temperature * 1.8) + 32);
			System.out.println(temperature + "C is " + farenheitTemperature + "F.");
		}else {
			System.out.println("Error! input must be F or C!");
		}


		//System.out.println("temperature: " + temperature + " / scaleInput: " + scaleInput);
	}

}
