package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_20_ImpByPriorityQueue {

	public static void main(String[] args) {	
		Queue<Integer> q=new PriorityQueue<>();
		
		//lowest value will be the priority obj
		q.add(100);
		q.add(10);
		q.add(1000);
		q.add(1);
		q.add(111);
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		Queue<String> q1=new PriorityQueue<>();
		q1.add("Noyon");
		q1.add("Ayan");
		q1.add("Abyan");
		q1.add("Zayan");
		
		System.out.println(q1.peek());
		
	
		

	}

}
