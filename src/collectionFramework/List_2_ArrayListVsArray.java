package collectionFramework;

import java.util.ArrayList;

public class List_2_ArrayListVsArray {

	public static void main(String[] args) {
		
		
int ar[]= {5,8,9,10};
//System.out.println(ar[3]);

//printing all by using for each loop

for(int single:ar) {
	System.out.println(single);
}

int arr1[]=new int[3];
		
		
	
ArrayList arrayList =new ArrayList();//12+6=18 
arrayList.add(5);
arrayList.add(5);
arrayList.add("s");
arrayList.add(50);//3 position
arrayList.add(15);//4
arrayList.add(505);
arrayList.add(505);
arrayList.add(505);
arrayList.add(505);
arrayList.add(505);
arrayList.add(505);
arrayList.add(505.5);
arrayList.add("sohag");

//print by index
//System.out.println(arrayList.get(2));

//addAll()


//create another arrayList
ArrayList<Integer> arrayList1 =new ArrayList();

arrayList1.add(100);

arrayList1.addAll(arrayList);

for(int single:arrayList1) {
	System.out.println(single);
}






	
	}

}
