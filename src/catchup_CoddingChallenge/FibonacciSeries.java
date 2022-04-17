package catchup_CoddingChallenge;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		// doing by not creating a method
		int [] index = new int[8];  // index[0]=0, index[1]=1, index[2]=1,index[3]=2
		
		
		for(int i=2; i<8; i++) {
			if (i<2) {
				index[i]=i;
			} else {
				index[i] = index [i-1] + index [i-2];
			}
		}
		
		System.out.println(Arrays.toString(index));

//0 1 1 2 3.......

	}

}
