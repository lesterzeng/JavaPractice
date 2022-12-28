class Demo1 {
	int a=10;
	static int b=20;
	private int c = 30; // private members do not participate in inheritance.
}

class Demo2 extends Demo1{
	int a=100;
	void disp() {
		int a=1000;
		System.out.println(a + " this is a local variable");
		System.out.println(this.a + " this is instance variable");
		System.out.println(super.a + " this is parent's variable");
		System.out.println(b + " will print parent's variable by default");
	}
}

class Demo3 extends Demo2 {
	void disp() {
		System.out.println(a + " from demo3, parent is demo 2");
	}}
	
class Demo4 extends Demo3 {
	void disp() {
		System.out.println(a + " from demo4, parent is demo 3");
	}

}

//6Dec first session

class Test1{
	int a, b;
	
	Test1(){
		this(1000,2000);
//		a=10;
//		b=20;
	}
	
	Test1(int a, int b){
//		this.a=a;
		this.b=b;
	}
}

class Test2 extends Test1{
	int c, d;
	
	Test2(){
//		this(11, 22);
		c=11;
		d=22;
	}
	
	Test2(int c){
//		super(111,222);
//		this();
		this.c=c;
//		this.d=d;
		d=1111;
	}
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}



public class Launch1 {

	public static void main(String[] args) {
			Demo2 x1 = new Demo2();
			x1.disp();
			Demo3 x2 = new Demo3();
			x2.disp();
			Demo4 x3 = new Demo4();
			x3.disp();
			// 6Dec onwards
			Test2 x = new Test2();
			x.disp();
	}

}

