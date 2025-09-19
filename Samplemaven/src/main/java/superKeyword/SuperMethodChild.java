package superKeyword;

public class SuperMethodChild extends SuperMethod{

	public void display1() {
		 super.display();
		System.out.println("child method");
	}
	public static void main(String[] args) {
		SuperMethodChild child=new SuperMethodChild();
		child.display1();
		
	}

}
