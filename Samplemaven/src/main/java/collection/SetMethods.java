package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {

Set <String> S =new HashSet <String> ();
		
		Set <String> I = new HashSet <String> ();
		
		// Add method
		S.add("White");
		S.add("Blue");
		S.add("Red");
		S.add("White");
		
		I.add("Green");
		I.add("Indigo");
		
		System.out.println(S);
		
		// Add All method
		S.addAll(I);
        System.out.println(S);
        
      //  I.addAll(S);
      //  System.out.println(I);
        
        // contains
        System.out.println(S.contains("Indigo"));
        
        //contains All
        System.out.println(S.containsAll(I));
        System.out.println(I.containsAll(S));
        
        // is empty
        System.out.println(I.isEmpty());
        
        // remove
        I.remove("Indigo");
        System.out.println(I);
        
        //remove All
        System.out.println(S);
        System.out.println(I);
       
        S.removeAll(I);
        System.out.println(S);
        
        //size
        System.out.println(S.size());
        
        //clear
        I.clear();
        System.out.println(I);
	}
}
