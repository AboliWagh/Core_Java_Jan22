package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(20);
		stack1.push(40);
		stack1.push(80);
		
		//for removing last value/input LIFO (Last In First Out)
		stack1.pop();
		
		stack1.push(120);
		//stack1.pop();
		
		System.out.println(stack1);

		//to show the last element came to stack
		System.out.println(stack1.peek());
		
		//to show the first  element came to stack
				//System.out.println(stack1.peek());
	}

}
