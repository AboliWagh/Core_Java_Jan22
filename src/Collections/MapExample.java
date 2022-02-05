package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HASH MAP
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1,"Aboli");
		map1.put(2,"Amit");
		map1.put(3,"Ved");
		map1.put(10,"Veer");
		
		System.out.println(map1);
		
		//Reading one particular value
		System.out.println("Reading one particular value " +map1.get(3));
		
		//update the data in map 
		map1.put(10,"Cookie");
		System.out.println("After updating " +map1);
		
		//delete the entry
		
		map1.remove(10);
		System.out.println("After deleting " +map1);
		
		//Iterating through map 
		
		for(Map.Entry<Integer,String> entry : map1.entrySet()) {
			
		//System.out.println(entry.getKey());
		//System.out.println(entry.getValue());
		System.out.println(entry.getKey()+" " +entry.getValue());
		}
		
		for (Integer val : map1.keySet()) {
			System.out.println("Kay is " +val);
			System.out.println("Value  is " +map1.get(val));
		}
		
		for (String  val : map1.values() ) {
			System.out.println("Value is " +val);
		}
		
		//============================================================================			
		// LINKEDHASH MAP
				LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
				map2.put(10,"Veer");
				map2.put(1,"Aboli");
				map2.put(2,"Amit");
				map2.put(3,"Ved");
				
				
				System.out.println("LinkedHash Map " +map2);
//============================================================================	
		// TREE MAP
			TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
				
			map3.put(1,"Aboli");
			map3.put(2,"Amit");
			map3.put(10,"Veer");
			map3.put(3,"Ved");
			
				System.out.println("Tree Map " +map3);
	}

}
//Assignment using Java Map (occurrence in each and every word in String)
//String str1 = "Clean India Green India Love India"
//count words ... kay String //  value Integer