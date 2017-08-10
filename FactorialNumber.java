
public class FactorialNumber {

	public static void main(String[] args) {
		// Write a program  to calculate factorial of a given number. You need to compute the factorial 
		//with one logic that uses recursion and another logic without recursion.
		
		int num = 3, res = 1;
		
		for (int i=num; i >=1 ; --i) {		
			res = res*i;
		}

		System.out.println(res);
		
		System.out.println("Recursion: " + fact(num));
	}
	
	public static int fact(int n) {
		if (n != 1) {
			return n * fact(n-1);
		} else
			return n;
	}
}
