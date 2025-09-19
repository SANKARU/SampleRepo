package encapsulation;

public class Encap1 {

	private String Name;
	private int Age;
	public void setter(String Name, int Age) {

		this.Name=Name;
		this.Age=Age;
	}

	public void getter() {
     System.out.println(Name+" "+Age);
	}

}
