package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_19_impPriorityque_customized {

	public static void main(String[] args) {
		EnthrallSt st1=new EnthrallSt("Noyon",30);
		EnthrallSt st2=new EnthrallSt("Tara",32);
		EnthrallSt st3=new EnthrallSt("Sohag",40);
		EnthrallSt st4=new EnthrallSt("Shimul",88);
		
		
		
		Queue<EnthrallSt> q=new PriorityQueue<>(new CompareSt());
		q.add(st1);
		q.add(st2);
		q.add(st3);
		q.add(st4);
		
		
		System.out.println(q.peek().name);

	}

}
