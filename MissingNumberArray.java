
public class MissingNumberArray {

	public static void main(String[] args) {
		// Write a program to find the missing number in a series of sorted
		// numbers stored in an array.

		int[] num = { 1, 2, 7, 8, 11 };
		int n = num[0];

		for (int i = 1; i < num.length; i++) 
		{
			n = n + 1;
			if (n != num[i]) {
				while (n < num[i]) 
				{
					System.out.println(n);
					n = n + 1;
				}
			}
		}
	}
}
