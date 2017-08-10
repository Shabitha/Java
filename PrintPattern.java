
public class PrintPattern {

	public static void main(String[] args) {
		// Write a program  that prints a pattern like below.
		
		for (int i = 0; i<8; i++)
		{
			for (int j = 0; j<=i ; j++)
			{
				System.out.print("* ");	
			}
			
			System.out.println();
		}

	}

}
