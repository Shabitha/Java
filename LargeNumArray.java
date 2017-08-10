
public class LargeNumArray {

	public static void main(String[] args) {
		// Write a program to find the largest number in a given array.
		
		int [] numbers = {12,17,23,80,100,16,20,225,34,65};
		
		int largest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] > largest){
				largest = numbers[i];
			}
			
		}
		System.out.println("Largest number in the array list is: "+ largest);
			
		

	}

}
