// Main Bird Class
abstract class Bird {
	
	abstract void fly();
	abstract void eat();
}

// Type of Bird 1 - Sparrow
class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow eats grains");
	}
	void eat() {
		System.out.println("Sparrow flies at low heights");
	}
}

// Type of Bird 2 - Eagle
abstract class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle flies at high heights");
	}
	
	abstract void eat(); // don't need to add this line when abstract is added in the class above ^
}

// Type of Eagle - Golden Eagle
class GoldenEagle extends Eagle{

	void eat() {
		System.out.println("Golden Eagle flies over the ocean and eat");
	}
}

// Type of Eagle = Serpent Eagle
class SerpentEagle extends Eagle{

	
	void eat() {
		System.out.println("Serpent Eagle flies over the mountain and eat");
	}
}

class Sky{
	void permit(Bird ref) {
		ref.fly();
		ref.eat();
	}
}


public class LaunchBird {

	public static void main(String[] args) {
		Sparrow sp = new Sparrow();
		GoldenEagle ge = new GoldenEagle();
		SerpentEagle se = new SerpentEagle();
		
		Sky s= new Sky();
		s.permit(sp);
		s.permit(ge);
		s.permit(se);
		
	}

}
