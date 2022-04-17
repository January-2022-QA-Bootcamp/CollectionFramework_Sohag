package catchup_CoddingChallenge;

public class PyramidShape {
	public static void pyramid(int n) {


//outer loop----give us line(rows)
		for (int i = 0; i < n; i++) { // 0, 1, 2, 3, 4 // 0, 1, 2, 3 // 0, 1, 2 , ........
			//inner loop-space before star
			for (int j = 0; j < n - i; j++) { // 0, 1, 2, 3, 4 // 0, 1, 2, 3 // 0, 1, 2 ......
				System.out.print(" "); //we are using print() method not println()
			}
			//inner loop-print stare and white space
			for (int k = 0; k <= i; k++) { // 0, // 0, 1 // 0, 1, 2 ..........
				System.out.print("* "); //we are using print() method not println()
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {



		pyramid(5);



	}



}
