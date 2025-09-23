package abstraction;

public class AbstractChild extends AbstractParent{
 
	public void ne() {
		System.out.println("child");
		
	}
	
	
	public static void main(String[] args) {
		AbstractChild n=new AbstractChild();
		n.display();
		n.ne();
		n.print();

	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hidden");
		
	}

}
