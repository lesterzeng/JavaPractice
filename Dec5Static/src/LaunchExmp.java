class Exmp{
	int a=10, b=20, c=30;
	static int x=11, y=22, z=33;
	
	
	Exmp(){
		System.out.println("Inside a constructor");
	}
	
	void display1() {
		System.out.println("Inside non-static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	static void display2() {
		System.out.println("Inside static method");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	{System.out.println("Inside non-static block");}
	
	static {
		System.out.println("Inside static block");
	}
}

// Order of execution
//1) static variable
//2) static block
//3) static method
//4) instance variable, executed during object creation
//5) non-static block executed before constructor

public class LaunchExmp {
	public static void main(String[] args) {
		Exmp.display2();
//		Exmp.display1(); doesn't work because it's not static. Need to create object as below
//		Static method is used for things like formulaes like converting km to m
		Exmp e = new Exmp();
		e.display1();
	}
}
