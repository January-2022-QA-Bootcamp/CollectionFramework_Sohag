package collectionFramework;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class List_4_ArrayList_HatrogenousType {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		
		arrayList.add("Sohag");
		arrayList.add(42);//Integer not int
		arrayList.add(170.5);
	
	
	for(int j=0;j<arrayList.size();j++) {
		System.out.println(arrayList.get(j));
	}
	
	
	}
	
	

	

}
