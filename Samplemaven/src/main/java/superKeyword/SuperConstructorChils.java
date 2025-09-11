package superKeyword;

public class SuperConstructorChils extends SuperConstructorParemt {
	public SuperConstructorChils() {
		super(2, 4);
		System.out.println("Super");
	}

	public static void main(String[] args) {

		SuperConstructorChils n=new SuperConstructorChils();
	}

}
