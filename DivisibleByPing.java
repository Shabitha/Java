
public class DivisibleByPing {

	public static void main(String[] args) {
		// WBL java programming to "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
		//and "ping pong" if number is divisible by both, else print the number.
		
		int n = 12;
		
			if (n % 3 == 0) 
			{System.out.println("ping");} 
			else   
			{ System.out.println("Number "+ n +" is not divisible by 3");}
		
			if (n % 5 == 0)
			{System.out.println("pong");}
			else 
			{System.out.println("Number "+ n +" is not divisible by 5");}
		
			if ((n % 3 == 0) && (n % 5 == 0))
			{System.out.println("ping pong");}
			else 
			{System.out.println("The number " + n + " is not divisible by either 3 or 5");}
		
	}
	}
