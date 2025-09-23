package interfaceExample;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	
	public void fo() {
		System.out.println("new");
	}

	public static void main(String[] args) {
		
		MultipleChild m=new MultipleChild();
		m.fo();
		m.parent1();
		m.parent2();
	}

	@Override
	public void parent2() {
		// TODO Auto-generated method stub
		System.out.println("trial");
	}

	@Override
	public void parent1() {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

}
