package collectionFramework;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class List_9_LinkedList_AddObjFromOutside {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		//by scanner/random class we will get obj
		
		Scanner scanner=new Scanner(System.in);
		
		Random random=new Random(100);
//		int obj=scanner.nextInt();
//		list.add(obj);
		//System.out.println("Please give your input");
		
		for(int i=0;i<15;i++) {
			list.add(random.nextInt());
		}
		
		
		System.out.println(list.size());
		
		for(int temp:list) {
			System.out.println(temp);
		}
		
		
		

		
	}

}

