package assignments;

public class InheritanceChild2_Assignment extends InheritanceChild1_Assignment {

	public void TotalSalary() {
		InheritanceChild2_Assignment j = new InheritanceChild2_Assignment();
		double hra = j.hra();
		int pay = j.basicpay(1000);
		int bonus = j.bonus(100);
		int deduction = j.deductions(10);
		int pf = j.pf(500);

		double TotalSalary = pay + hra - pf - deduction + bonus;
		System.out.println("Total Salary-->" + " " + TotalSalary);

	}

	public static void main(String[] args) {
		InheritanceChild2_Assignment v = new InheritanceChild2_Assignment();
		v.TotalSalary();

	}

}
