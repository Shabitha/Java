
public class CommonNumArrays {

	public static void main(String[] args) {
		// Write a program to find the common number in any given two arrays.
		
		int [] first = {1,2,3,4,5,6,7,8,9};
		int[] second = {1,2,3,14,5,16,17,18,19};
		
		for (int i = 0; i < first.length ; i++)
		{
			for (int j = 0; j < second.length ; j++)
			{
				if (first[i] == second[j])
				{
					System.out.println(first[i]);
				}
			}
		}

	}

}
