package exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {

		// this is used to print exception
		// we can give the name of the in build exception in java depending on the case
		// its our desire to
		// add the required exception
		// here instead of else we use throw for printing the exception

		int age = 16;
		if (age > 18) {

			System.out.println("Eligible to vote");
		} else {
			throw new NumberFormatException("age under 18!!!");

		}

	}
}
