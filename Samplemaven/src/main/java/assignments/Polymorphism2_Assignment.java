package assignments;

public class Polymorphism2_Assignment extends Polymorphism1_Assignment {

	double a;

	public void discount(int price) {

		super.discount(5000);
		a = 0.40 * price;
		System.out.println("The Offseason price of the cloth is-->" + a);
	}

	public static void main(String[] args) {

		Polymorphism2_Assignment latest = new Polymorphism2_Assignment();
		latest.discount(5000);

	}

}
