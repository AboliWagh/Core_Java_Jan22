package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet (will not alloed duplicate values but can add null and it can be print in any order)
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Name 1");
		set1.add("Name 1");
		set1.add("Name 2");
		set1.add("Name 3");
		set1.add("Name 4");
		set1.add("Name 5");
		set1.add(null);
		//set1.add(null);
		System.out.println(set1);
		
		//Retrive Data 
		
		//Iterator <String> i = set1.iterator();
		
		// Linked HAshSet (Maintain the order of data input )
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Rick");
		//set2.add("Rick");//cannot add duplicate value
		set2.add("Raj");
		set2.add("Mira");
		set2.add("Reena");
		set2.add(null);
		
		System.out.println(set2);
		
		//TreeSet (Maintain the Ascending order of data input and cannot add null value and can ot add duplicate value )
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Rick");
		//set3.add("Rick");//cannot add duplicate values
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		//set3.add(null);//cannot add null value
		
		
		System.out.println(set3);
		
		
		/*String str = "Clean World Green World";
		//String line = "";
		
		LinkedHashSet<String> char1 = new LinkedHashSet<String>();

		for(int index=str.length()-1;index>=0;index--) {
			
			//str.add(str.charAt(index));
			char1 = char1 + str.charAt(index);
		}
		
		System.out.println("Reversed String " + revstr);  
		
		
		System.out.println(result);
		
		/*String str="hello world clean world";
        String [] arr=str.split(" ");
        HashSet<String >hs=new HashSet<String>();
        for (int index=0;index<arr.length;index++)
        {
            hs.add(arr[index]);
        }
        //hs.add(arr[1]);
        System.out.println("hs"+hs);
		
		
		

	}*/
	}
}
