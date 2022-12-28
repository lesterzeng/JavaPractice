//Custom Exceptions to handle faulty logic, not faulty input.
//Try and Catch handle faulty inputs, not faulty logic, like stackedoverflow or outofmemoryerror during Runtime System.

class Demo11{
	void fun(){
		try {
		fun(); // Recursion method. It keeps calling the method(itself), it keeps looping infinitely. Need to add a condition to come out.
		} catch (Exception e) {
			System.out.println("Problem resolved");
		}
	}
}


public class Launch2 {

	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.fun();
		
		int arr[] = new int [5];
	}
}
