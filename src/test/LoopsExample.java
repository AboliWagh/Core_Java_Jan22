package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//While Loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
			
			if(num1==5) {
				num1 = num1+1;
				continue;
			}
		
			System.out.println(num1);
		
			num1 = num1+1;
			
		}
		
		//for Loop to type 1 to 10
		for(int count=1;count<=10;count++) {
			//System.out.println("inside for loop" + count);
			
			if(count==5) {
				//num1 = num1+1;
				break;
			}
			System.out.println("inside for loop" + count);
			
		}
		System.out.println("************************");
		//for loop new example
		for (int count=10;count>=1;count--) 
			//System.out.println("inside for loop" + count);
			
			
			System.out.println("inside for loop" + count);
			
		//Arrays with Loop
		int[] array1 = {20,30,40,50,60};
		
		for(int index=0;index<array1.length;index++) {
		
		System.out.println("Value inside array " + array1[index]);
	}
		//enhance for loop //for each loop
		for(int value:array1) {
			System.out.println(value);
		}
		for(int Aboli:array1) {
			System.out.println(Aboli);
		}
	}

}
