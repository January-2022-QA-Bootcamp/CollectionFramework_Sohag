package catchup_CoddingChallenge;

public class PalindroneCheck {
	public static void isPalindromeNumber(int num) {
		
		//314



		int r = 0;
		int sum = 0;
		int t = num;
 


		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		
		if (t == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}



	}



	public static void main(String[] args) {
		isPalindromeNumber(313);
		isPalindromeNumber(213);



	}



}
