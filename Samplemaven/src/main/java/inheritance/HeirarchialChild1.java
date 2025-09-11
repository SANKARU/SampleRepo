package inheritance;

public class HeirarchialChild1 extends HeirarchialParent {
	
	public void child1() {
		
		System.out.println("I'm the Heirarchial Child 1");
	}

	public static void main(String[] args) {
		HeirarchialChild1 n= new HeirarchialChild1();
		n.parent();
		n.child1();

	}

}
