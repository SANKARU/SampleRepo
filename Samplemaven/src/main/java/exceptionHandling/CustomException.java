package exceptionHandling;

public class CustomException {
	
	//create constructor
	//add super keyword in constructor
	//add throws declaration

	public static void main(String[] args) throws VotingException, AgeException {
		int age = 16;
		if (age > 18) {

			System.out.println("Eligible to vote");
		} else {
			throw new AgeException("age under 18!!!");

		}

	}

}
