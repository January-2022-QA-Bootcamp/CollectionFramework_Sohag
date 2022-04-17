package collectionFramework;

import java.util.Stack;

public class List_16_Stack_usingMethods {

	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		//System.out.println(list.size());//0
		list.add(5);//adding first==tail
		list.push(10);
		list.push(100);
		list.push(10000);
		list.push(1110);
		list.push(22);
		list.push(3);
		list.push(888);//adding last==head
		
		System.out.println(list.search(10000));//it returns the position
		System.out.println(list.size());
		//System.out.println(list.peek());//return the top element
		//System.out.println(list.pop());//return the top element and remove
		
		
		for(int i=0;i<8;i++) {
			System.out.println(list.pop());
		}
		
		//as we removed every obj--no more element
		
		//System.out.println(list.size());//0
		System.out.println(list.empty());
		
		

	}

}
