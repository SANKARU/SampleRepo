package aggregation;

public class Aggregator2 {
	
	String city;
	String state;
	Aggregation1 ref;
	
	//for aggregation we need to create a reference variable to perform HAS Relationship-
	//for which variable we are going to create reference variable we have to make it into datatype
	
	public Aggregator2(String city,String state,Aggregation1 ref) {
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	
	public void display() {
		System.out.println("Name->"+ref.Name+" / "+"Roll->"+ref.Roll);
		System.out.println("city->"+" "+city+" / "+"state->"+" "+state);
	}

	public static void main(String[] args) {
		Aggregation1 obj1=new Aggregation1("Gautham",21);
		//we need to pass the object name of class 1 in object 2 for ref variable
		Aggregator2 obj2=new Aggregator2("kochi","kerala",obj1);
		obj2.display();
		
		

	}

}
