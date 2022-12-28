import java.util.ArrayList;

public class Launch1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(10.5f);
//		al.add("A");
//		al.add(false);
//		System.out.println(al);
		
		for(int i = 1; i<=10; i++) {
			al.add(Integer.valueOf(i));
		}
		System.out.println(al);

	}

}
