package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 17;
		boolean flag = true;
		
		for(int index=2;index<num;index++) {
			int remainder = num%index;
			if(remainder == 0) {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			
			System.out.println("The Num is Prime");
		}else
			System.out.println("The Num is not Prime");
	}

	
}
