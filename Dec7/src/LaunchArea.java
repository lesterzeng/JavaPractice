import java.util.Scanner;


abstract class Shape{
	float area;
	
	abstract void acceptInput();
	abstract void compute();
	void display() {
		System.out.println(area);
	};
}


class Triangle extends Shape{
	float base;
	float height;
	
	void acceptInput() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter base of Triangle");
	base = scan.nextFloat();
	
	System.out.println("Enter height of Triangle");
	height = scan.nextFloat();
	}
	
	void compute() {
	area = 0.5f*base*height;
	
	}
}

class Rectangle extends Shape{
	float length;
	float breadth;

	
	void acceptInput() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter base of Rectangle");
	length = scan.nextFloat();
	
	System.out.println("Enter height of Rectangle");
	breadth = scan.nextFloat();
	}
	void compute() {
	area = length*breadth;
	
	}
}

class Circle extends Shape{
	float radius;

	
	void acceptInput() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter radius of Circle");
	radius = scan.nextFloat();
	

	}
	void compute() {
	area = 3.142f*radius*radius;
	
	}
}

class Geometry {
	void permit(Shape ref) {
		ref.acceptInput();
		ref.compute();
		ref.display();
	}
}
	
public class LaunchArea {

	public static void main(String[] args) {
			Triangle t = new Triangle();
			Rectangle r = new Rectangle();
			Circle c = new Circle();
			
			Geometry g = new Geometry();
			g.permit(t);
			g.permit(r);
			g.permit(c);
		}
	}
