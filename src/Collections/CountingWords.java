package Collections;

import java.util.HashMap;

public class CountingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
////Assignment using Java Map (occurrence in each and every word in String)
		//String str1 = "Clean India Green India Love India"
		//count words ... kay String //  value Integer
		
		//String str1 = new String ("Clean India Green India Love India");
		//System.out.println("Before removing duplicates **** " + str1);
		 String str = "Clean India Green India Love India";
		 //String str = "My Life My Rules";
		 
		 HashMap<String, Integer> hashMap = new HashMap<>();
	 
	        String[] words = str.split(" ");
	 
	        for (String word : words) {
	            // containsKey(key) will return a boolean value
	            // i.e. true if it contains the key and false if
	            // it doesn't.
	        	
	            if (hashMap.containsKey(word))
	                hashMap.put(word, hashMap.get(word) + 1);
	 
	            else
	                hashMap.put(word, 1);
	        }
	 
	        System.out.println(hashMap);
	    }
	}


