
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		boolean isPrime = true;
		
		for (int i = 2; i <= n/2 ; i++){
			if (n%i == 0){
				isPrime = false;
				break;
			}
		}
		
		System.out.println("Is " + n + " a prime number? " + isPrime);
	}

}
