package collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_18_ImpByLinkedList {

	public static void main(String[] args)
    {
        //implementing Queue by LinkedList or creating q
		
		Queue<Integer> queue=new LinkedList<>();
		//first in first out (FIFO)
		queue.add(500);
		queue.add(15);
		queue.add(25);
		queue.add(50);
		//printing all obj in q
		System.out.println(queue);
		//printing obj by for each loop
//		for(int q:queue) {
//			System.out.println(q);
//		}
//		//first in first out (FIFO)---objects will go out
		//System.out.println(queue.peek()); //top obj will be selected
		
		//removing
		//System.out.println(queue.poll());//taking top and removing
		
		//System.out.println(queue.peek()); //top obj will be selected
		
		//check collection is empty or not if not print obj
		
		for(int i=0;i<5;i++){
			if(!queue.isEmpty()) {
				System.out.println(queue.poll());
				
			}	
		}
		
		
		
		
			
		
		
	}


}
