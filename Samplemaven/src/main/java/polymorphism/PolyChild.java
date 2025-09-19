package polymorphism;

public class PolyChild extends PolyParent{

	public void display(int a, int b) {
        
		super.display(4, 5);
		int sum = a - b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		PolyChild n=new PolyChild();
		n.display(7, 3);

	}

}
