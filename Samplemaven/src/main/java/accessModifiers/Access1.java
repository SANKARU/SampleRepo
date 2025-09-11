package accessModifiers;

public class Access1 {
    
	public void display() {
		System.out.println("public");
	}
	
	private void print() {
		System.out.println("private");
	}
	
	protected void hello() {
		System.out.println("protected");
	}
	
	
	void office() {
		System.out.println("default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 n=new Access1();
		n.display();
		n.print();
		n.hello();
		n.office();

	}

}
