package catchup_CoddingChallenge;

public class FactorialNumber {

	//1st way: doing by recursive method
	public static int recFactorial(int n) { // why I give static keyword?
		if (n==0) {
			return 1;
		} else {
			return n * recFactorial(n-1); // recFactorial(n-1) will give us (n-1) * recFactorial(n-2)
		}
		
	}
	
	// 2nd way: Doing by for loop   //5=5*4*3*2*1=120---5*4=20   20*3=60  60*2
	//1x2x3x4x5x6
	
	public static int factorial (int m) {
		int total = m; 
		for(int i=m-1; i>=1; i--) {
			total = total*i;
		}		
		return total;
	}
	



	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(factorial(10));
	}



}




