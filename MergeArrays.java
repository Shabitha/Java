import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {7,8,9,3,2,1};
		System.out.printf("Given array1{} : %s", Arrays.toString(arr1));
		System.out.printf("\n"+"Given array2{} : %s", Arrays.toString(arr2));
		
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < arr1.length ; i++)
		{
			if (!(arr3.contains(arr1[i]))){
				arr3.add(arr1[i]);
			}
		}
		for(int j = 0; j < arr2.length ; j++)
		{
			if (!(arr3.contains(arr2[j]))){
				arr3.add(arr2[j]);
			}
		}
		//System.out.println("Elements in a3" + a3);
		Collections.sort(arr3);
		System.out.println("\n"+"Sorted array : " + arr3);

	}

}
