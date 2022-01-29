package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String str1 = scanner.nextLine();


		//String str1 = "Clean World Green World";
		int vowelCount = 0;
		
		for(int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			
			switch(temp) {
			
			case 'a':
			case 'e':	
			case 'i':
			case 'o':	
			case 'u':
			case 'A':
			case 'E':	
			case 'I':
			case 'O':	
			case 'U':
				vowelCount = vowelCount+1;
				break;
					
				//default:
				//System.out.println("Inside Default");	
				
			}
		
		}
		System.out.println("The total vowels are " + vowelCount);
		scanner.close();
		
	}

}
