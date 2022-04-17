package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class List_10_LinkedList_UserDefinedObj {

	public static void main(String[] args) {
		EnthrallSt student1=new EnthrallSt("Tanushree", 25);
		EnthrallSt student2=new EnthrallSt("Farima", 24);
		EnthrallSt student3=new EnthrallSt("Faisal", 28);
		
		
		
		
		LinkedList<EnthrallSt> stList=new LinkedList<>();
		stList.add(student1);
		stList.add(student2);
		stList.add(student3);
		
	
		System.out.println(stList.size());	
		for(EnthrallSt singleSt:stList) {
			System.out.println(singleSt.name);
		}
		
		

	}

}
