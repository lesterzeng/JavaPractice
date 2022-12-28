// Example of functional interface, lambda function(anonymous function). Lambda can only be used in functional


@FunctionalInterface
interface MyInterf{
	void fun();
}

@FunctionalInterface
interface MyInterf2{
	int add(int x, int y);
	
}

public class LaunchInterface {

	public static void main(String[] args) {
//		MyClass1 mc1 = new MyClass1();
//		mc1.fun();
		
		//Function
//		MyInterf ref = new MyClass1();
//		ref.fun();
		
		// Lambda function below. Example 1
		MyInterf ref = ()-> System.out.println("I am inside fun method");
		ref.fun();
		
		//Lambda function below. Example 2
		MyInterf2 ref2 = (x, y) -> x+y;
		System.out.println(ref2.add(10, 10));
	}

}
