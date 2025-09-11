package inheritance;

import accessModifiers.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		Access1 j=new Access1();
		j.display();
		Access3 b=new Access3();
		b.hello();
		b.display();
	}

}
