// PriorityQueue Example - Useful to find smallest value
// Minimum Heap
// Training continued on 16 Dec

import java.util.PriorityQueue;

public class Launch3 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(40);
		pq.add(20);
		pq.add(60);
		pq.add(30);
		pq.add(80);
		pq.add(50);
		pq.add(70);
		pq.add(90);
		System.out.println(pq);
	}
}
