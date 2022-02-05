package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList <String>();
		
		arraylist1.add("Aboli");//0 Index
		arraylist1.add("Amit");//1 Index
		arraylist1.add("Ved");//2 Index
		arraylist1.add("Veer");//3 Index
		
		
		System.out.println("The size of arraylist is " +arraylist1.size());
		
		System.out.println(arraylist1);
		
		System.out.println("The size of arraylist is " +arraylist1.size());
		
		System.out.println("The element at 0 index is  " +arraylist1.get(0));
		
		//arraylist1.remove(0);
		
		System.out.println("The size of arraylist is " +arraylist1.size());
		
		arraylist1.set(0,"Ketaki"); //to replace value at 0 position
		
		
		//Iterating through arraylist
		
		for (int index=0;index<arraylist1.size();index++) {
			
			System.out.println(arraylist1.get(index));
			
			System.out.println("**************************");
		}
		
		//2nd type for Iterating through arraylist
		
		for(String name: arraylist1) {
			System.out.println(name);
			
			System.out.println("**************************");
		}
		// Using Iterator using While Loop
		Iterator <String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Sorting of arraylist Asending order (by default)
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		//sorting  of arraylist Decending Order (reverseorder)
	
		 Collections.sort(arraylist1, Collections.reverseOrder());
		 System.out.println("In Decending Order");
		 System.out.println(arraylist1);
	}

}
