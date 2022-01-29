package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse String Variable
		//Reversal of Array
		//reversal of number
		
		//reverse String Variable
		String str1 = "Clean India Green India";
		String revStr1 = "";
		
		for(int index=str1.length()-1;index>=0;index--) {
			
			revStr1 = revStr1 + str1.charAt(index);
		}
		System.out.println("Reversed String " + revStr1);
		
		
		//count the vowels from the code
		int result = 0;
		
		for(int index=0;index<str1.length();index++) {
			if(str1.charAt(index) == 'a' || str1.charAt(index) ==  'e' || str1.charAt(index) ==  'i' || str1.charAt(index) == 'o' || str1.charAt(index) ==  'u') {
				result ++;
				System.out.println("====" + result);
			}
		}
		//Reversal of Array
			int[] array1 = {20,30,40,50,60};
			
			for(int index=array1.length-1;index>=0;index--) {
				System.out.println(array1[index]);
			}
			//reversal of number
			
			int num =54321;
			int revnum = 0;
			
			while (num>0)
			{
				revnum = revnum * 10;
				revnum = revnum + num%10;
		          num = num/10;
			
			}
			System.out.println("Reverse of specified number is: "+revnum);
	}
	// n
	//int num12 = 987654321;
	//int rev = 0;
	
	//while (num12>0) {
	//int remainder = num12%10;
	
	//rev = remainder;
	//num12 = num12/10;
	
	//}//
	
//int n1 = 345278;
//String str1 = String.valueOf(n1);

//String[] str2 = str1.split("");
//int len = str2.length;
//for (int j= len-1; j>=0; j--) {
    //System.out.print(str2[j]);
//}
}
	
	
	

