package interfaceExample;

public class Interface2 implements Interface1 {

	public static void main(String[] args) {
		
		Interface2 m=new Interface2();
		m.display();
		m.print();
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Print something");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing someting");
	}

}
