package catchup_CoddingChallenge;

import java.util.Iterator;

public class PlusSignShape {
int args=6;
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			if(i!=3) {
				for(int j=0;j<=6;j++) {
					if(j==3) {
						System.out.println("*");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int k=0;k<=6;k++) {
					System.out.print("*");}
				
			}
			
			
		}
	}

}
