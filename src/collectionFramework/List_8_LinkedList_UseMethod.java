package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class List_8_LinkedList_UseMethod {
	
	public static void main(String[]args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);//
		list.add(15);//
		list.addLast(5000);
		list.add(25);//
		list.add(35);//
		list.addFirst(50);
		
		
		
		
		for(int singleObj:list) {
			System.out.println(singleObj);
		}
		System.out.println("-------------------"	);	
		list.removeFirst();
		
		for(int singleObj:list) {
			System.out.println(singleObj);
		}
		
	}
	
	
	
	
	

}
