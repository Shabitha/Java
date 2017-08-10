
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		//  Write a program to sort an array.
			
			int[] arr = {46,13,16,87,1,5,9,99};
			System.out.printf("Given array{} : %s",
                    Arrays.toString(arr));
			
	        Arrays.sort(arr);
	 
	        System.out.printf("%nModified arr{} : %s",
	                          Arrays.toString(arr));
	    }
	}

