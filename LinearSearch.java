import java.util.Arrays;

public class LinearSearch {
	
	public static void main(String[] args) {
		// Write a program to perform a linear search on any given array.
		int s = 56;
		int [] arr = {5,8,3,9,34,56,73,25,16};
		System.out.printf("Given array{} : %s", Arrays.toString(arr));
		System.out.println("\n" + "Searched number in the array is:" + s);
		
		for(int i = 0 ; i < arr.length ; i++){
			
				if(arr[i] == s) 
					{System.out.println("The number "+ s + " is present in the given array");}
				else 
					{System.out.println("The number "+ s + " is NOT present in the given array");}
		}
				
			} 
		
		}
		
		
		
		
	

	
	
	

