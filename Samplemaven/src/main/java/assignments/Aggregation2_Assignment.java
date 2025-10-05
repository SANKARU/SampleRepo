package assignments;

public class Aggregation2_Assignment {

	String address;
	Aggregation1_Assignment ref;

	public Aggregation2_Assignment(String address, Aggregation1_Assignment ref) {
		this.address=address;
		this.ref=ref;
	}

	public void display() {

		System.out.println("Name of Student: " + ref.name + " " + "Roll.No: " + ref.roll);
		System.out.println("Address of student: " + address);
	}

	public static void main(String[] args) {
		Aggregation1_Assignment m = new Aggregation1_Assignment("Gautham", 21);

		Aggregation2_Assignment n = new Aggregation2_Assignment("KLRA-15,KOCHI-16", m);

		n.display();

	}

}
