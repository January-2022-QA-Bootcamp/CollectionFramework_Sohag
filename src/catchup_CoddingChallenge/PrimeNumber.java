package catchup_CoddingChallenge;

public class PrimeNumber {
	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}



		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}



	// if we want to find out there is a range of number and they have prime number or not
	// how many prime number present in a range



	public static void findPrimeNumber(int number) {
		for (int i = 0; i <= number; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("The number 23 is prime number or not ? " + isPrimeNumber(9));
		findPrimeNumber(23);
		
		int num=9;
		
		
		
	}



}
