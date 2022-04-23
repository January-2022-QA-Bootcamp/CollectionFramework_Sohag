package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue_ImpArrayDeque {

	public static void main(String[] args) {
		//creating obj of ArrayDeque or implementiong Deuque by ArrayDeque
		Deque<String> dq=new ArrayDeque<>();
		dq.add("Shimul");//adding at the bottom
		dq.offer("Noyon");//adding at the bottom
		dq.push("sohag");//adding at the top
		dq.push("sohag1");//adding at the top
		
		
		System.out.println(dq.peek());
		
		
		Deque<String> dq1=new ArrayDeque<>();
		dq1.push("s1");
		dq1.add("s");
		dq1.addFirst("sp");
		dq1.push("sohag"); //push() or AddFirst()  adding at the top
		
		System.out.println(dq1.peek());  //  s s1 sp sohag
		
		
		
		Deque<String> dq2=new ArrayDeque<>();
		dq2.push("Noyon");
		dq2.push("Tara");
		dq2.push("Sohag");
		dq2.push("Shimul");
	
		//System.out.println(dq2.removeFirst());
		System.out.println(dq2.removeLast());
		//using contains() checking obj is there or not and execute our next lin
		if(!dq2.contains("Noyon")){
			System.out.println("Lets play");
		}
		
		
		
	}

}
