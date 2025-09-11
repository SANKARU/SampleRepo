package inheritance;

public class MultiLevelChild extends MultiLevelParent {

	public void child() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		MultiLevelChild n=new MultiLevelChild();
		n.display();
		n.print();
		n.child();
	}

}
