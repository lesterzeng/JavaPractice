// Treeset Example - Balanced Tree - Natural Sort Order
// Training continued on 16 Dec
// Useful for sorting in ascending order
// Add MyComparator for descending order

import java.util.Comparator;
import java.util.TreeSet;


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}
		
		else if (o1>o2) {
			return -1;
		} else
		return 0;
	}
}



public class Launch4 {

	public static void main(String[] args) {
//		TreeSet ts = new TreeSet(); // For ascending - by default
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator()); // For descending
//		ts.add(100);
//		ts.add(50);
//		ts.add(150);
//		ts.add(25);
//		ts.add(75);
//		ts.add(125);
//		ts.add(175);
		
		ts.add(11);
		ts.add(544);
		ts.add(516);
		ts.add(2512);
		ts.add(24);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
	}
}
