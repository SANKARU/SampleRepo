package superKeyword;

public class SuperVariableChild extends SuperVariable{
	 
	//Here if we give fruit this print only the fruit described in the child class,so we use super
	String fruit="Orange";
	public void display() {
		System.out.println(fruit);
		System.out.println(super.fruit);
	}

	public static void main(String[] args) {
		SuperVariableChild fruit=new SuperVariableChild();
		fruit.display();

	}

}
