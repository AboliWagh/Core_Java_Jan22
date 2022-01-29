package test;

public class DataTypeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 30;
		
		int sum = num1+num2;
		int sub = num2-num1;
		int mul = num1*num2;
		float div = (float) num2/num1;
		//String result = "The sum of two numbers is " + sum;
		
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The substraction of two numbers is " + sub);
		System.out.println("The multiplication of two numbers is " + mul);
		System.out.println("The dividion of two numbers is " + div);
		
		System.out.println("***********************************************");
		
		String name = "Clean India Green India";
		
		System.out.println("Total num of Chars are " + name.length());
		System.out.println("***********************************************");
		//char char1 = name.charAt(name.lentgth()-1);
		//System.out.println("Char are first place is " + char2);
		char char2 = name.charAt(0);
		System.out.println("***********************************************");
		System.out.println("The string in uppercase " + name.toUpperCase());
		System.out.println("***********************************************");
		System.out.println("The string in lowercase " + name.toLowerCase());


			
		
	}

}
