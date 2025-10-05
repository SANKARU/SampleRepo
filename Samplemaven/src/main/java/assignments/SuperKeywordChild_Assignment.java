package assignments;

public class SuperKeywordChild_Assignment extends SuperKeywordParent_Assignment {

	public void addresult() {

		int sum = super.addition(10, 1);
		if (sum % 10 == 0) {
			System.out.println("Divisible by 10");

		} else {
			System.out.println("Not Divisible by 10");
		}

	}

	public static void main(String[] args) {
		SuperKeywordChild_Assignment n=new SuperKeywordChild_Assignment();
		n.addresult();
	}

}
