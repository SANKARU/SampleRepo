package assignments;

import java.util.Scanner;

public class Encapsulation2_Assignment {

	// Return the pin entered by the user
	public int getPin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your pin: ");
		int pin = scanner.nextInt();
		return pin;
	}

	public static void main(String[] args) {
		Encapsulation2_Assignment inputObj = new Encapsulation2_Assignment();
		int userPin = inputObj.getPin(); // get pin from user

		Encapsulation1_Assignment pinObj = new Encapsulation1_Assignment();
		pinObj.getter(userPin); // set user pin
		pinObj.setter();
		pinObj.ValidatePin(); // validate pin
		
	
	}
}
