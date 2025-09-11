package inheritance;

public class SingleChild extends SingleParent {

	public void display() {
		System.out.println("I'm Child");
	}
	
	public static void main(String[] args) {
		
		SingleChild n=new SingleChild();
		n.display();
		n.print();
}
}