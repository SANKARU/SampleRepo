package assignments;

public class Encapsulation1_Assignment {

	private int pin;

	public void getter(int pin) {
		this.pin = pin;

	}

	public void setter() {
		System.out.println(pin);

	}

	public void ValidatePin() {
		if (pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("Valid Pin");

		} else {
			System.out.println("InValid Pin-->Enter a Valid Pin");
		}
	}
}
