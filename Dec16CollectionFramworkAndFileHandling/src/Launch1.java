// Anonymous object example
// Lambda expression and ternary operator example, helps in concise coding

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println(al); // Print as-is
		Collections.sort(al); // Sort in ascending by default
		System.out.println(al + "Sorted in ascending by default.");
		
//		MyComparator mc = new MyComparator(); // Method 1 - Instead of this, can do anonymous object as below, line 25
//		Collections.sort(al, mc); // Sort in custom order. In this case, descending - Traditional way to code.
		
//		Collections.sort(al, new MyComparator()); // Method 2
		
		//Method 3 Using Lambda expression and ternary operators
		Collections.sort(al, (o1, o2) -> (o1<o2)?1:(o1>o2)?-1:0); // *** Lambda expression & Ternary Operators in 2nd parameter*** 
		System.out.println(al + "Sorted in descending.");
	}
}

// Part of Method 3. It doesn't need another class and method(if statements) to run - comment out Method 2. 
// Instead it uses ternary operators to insert code directly in the 2nd parameters in line 28.

// Part of Method 2
//class MyComparator implements Comparator<Integer>{

	
//	public int compare(Integer o1, Integer o2) {
//		if(o1<o2) {
//			return 1;
//		} else if (o1>o2) {
//			return -1;
//		} else
//		return 0;
//	}

	
//}