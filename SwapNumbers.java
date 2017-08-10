
public class SwapNumbers {

	public static void main(String[] args) {
		// Write a program that swaps 2 given numbers. using a variable
		int a = 10, b = 20, c;
		System.out.println("Given numbers before swapping a = " + a + " and b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping using a variable a = " + a + " and b = " + b);	
		
		// Write a program that swaps 2 given numbers. without using a variable
			
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("After swapping without using varaible a = " + a + " and b = " + b);

	}
}
