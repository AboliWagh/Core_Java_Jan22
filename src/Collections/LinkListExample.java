package Collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("China");//0
		list1.add("India");//1
		list1.add("Singapore");//2
		list1.add("USA");//3
		//list1.addFirst("India");//4
		//list1.addLast("Australia");//5
		list1.add(2,"Bharat");
		System.out.println(list1);
		
		//Iterating through list1
		
				for (int index=0;index<list1.size();index++) {
					
					System.out.println(list1.get(index));
					
					//System.out.println("**************************");
		
				}
				
				LinkedList<Integer> list2 = new LinkedList<Integer>();
				
				list2.add(12);//0
				list2.add(24);//1
				list2.add(36);//2
				list2.add(48);//3
				list2.addFirst(300);//4
				list2.addLast(500);//5
				list2.add(2,100);
				System.out.println(list2);
	}
	

}
