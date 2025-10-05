package assignments;

public class InheritanceChild1_Assignment extends Inheritance_Assignment {

	int d;
	int f;

	public int pf(int d) {
		this.d = d;
		System.out.println();

		return d;
	}

	public double hra() {
		this.f = f;
		InheritanceChild1_Assignment n = new InheritanceChild1_Assignment();
		int pay = n.basicpay(10000);
		System.out.println("The Basic Pay is:-->" + pay);
		int deduce = n.deductions(2000);
		System.out.println("Deductions:-->" + deduce);
		int bonus = n.bonus(3550);
		System.out.println("Bonus:-->" + bonus);
		int pf = n.pf(2000);
		System.out.println("pf:-->" + pf);

		double f = (0.05 * pay) + (0.2 * pf);
		System.out.println("Basic HRA-->" + " " + f);
		return f;
	}

	public static void main(String[] args) {
		InheritanceChild1_Assignment m = new InheritanceChild1_Assignment();
		m.hra();

	}

}
