
public class FibonacciSeries {

	public static void main(String[] args) {
		// WBL java programming assignment

		int n1 =0, n2=1,count = 10;
		
		for (int i=0; i<count; i++){
			System.out.println(n1);	
			int x = n2;
			n2 = n1;
			n1 = x + n2;
		}
		
	}

}
