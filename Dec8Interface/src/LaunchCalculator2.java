// Example on Interfaces, including Functional Interface. Functional Interace only allows one abstraction

@FunctionalInterface
interface Calculator1{
	void add();
}

//Interface cannot implement another interface. It can only extend to a parent interface. 
//Also, remember inheritance, one class cannot have 2 parents. Only interfaces can do. 

interface Calculator2{
	void mul();
	void div();
}

class MyCalculator implements Calculator1, Calculator2{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
	public void div() {
		int a=100;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
}



public class LaunchCalculator2 {

	public static void main(String[] args) {
			MyCalculator mc1 = new MyCalculator();


			
	}

}
