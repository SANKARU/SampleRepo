package inheritance;

public class HeirarchialChild2 extends HeirarchialParent{
	
	public void child2() {
		System.out.println("I'm the Heirarchial Child 2");
	}

	public static void main(String[] args) {
		HeirarchialChild2 n=new HeirarchialChild2();
		n.parent();
		n.child2();
	}

}
