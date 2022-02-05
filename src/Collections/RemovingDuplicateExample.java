package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovingDuplicateExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String input = new String ("Clean World Green World");
	System.out.println("Before removing duplicates  " + input);
	HashSet<String> hs1 = new HashSet<String>();
	
	for (String word : input.split(" ")) {
		
		hs1.add(word);
	 }
		System.out.println(" After removing duplicates  " +hs1);
	}
	
		
	
	/*String output = new String ();
	System.out.println("The given String is  -- " + input);
		
		HashSet<String >xyz = new HashSet<String>();
		
		 for (int a = 0; a < input.length(); a++) {
	            
			// for (int b = 0; b > output.length(); b--) {
				 
	                
	            }*/
	       
		 
	    


	   

	
	}
//}

	


	
	
