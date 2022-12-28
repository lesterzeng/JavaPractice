class Animal1{
	
}

class Tiger1 extends Animal1{
	
}

class Demo11{
	Animal1 fun() {
		System.out.println("I am inside parent class");
		Animal1 a = new Animal1();
		return a;
	}
}

class Demo22{
	Tiger1 fun() {
		System.out.println("I am inside child class");
		Tiger1 t = new Tiger1();
		return t;
	}
}

///////////////////////////////////////////////////// ^^ Co-variants

class Animal{
	void eat() {
		System.out.println("Animal eat food");
	}
	
	void sleep() {
		System.out.println("Animal sleeps with eyes close");
	}
	
	void food() {
		System.out.println("Animal's type of food");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger hunts");
	}
	
	void food() {
		System.out.println("Tiger eats meat");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Deer forages");
	}
	
	void food() {
		System.out.println("Deer eats plants and fruits");
	}
}

class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey hunts occasionally and forages.");
	}
	
	void food() {
		System.out.println("Money eats plants, fruits and meat");
	}
}

class Zoo{
	void keep(Animal ref) {
		ref.eat();
		ref.sleep();
		ref.food();
	}
}
public class LaunchAnimal {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		Monkey monkey = new Monkey();
		Zoo zoo = new Zoo();
		
		zoo.keep(tiger);
		zoo.keep(deer);
		zoo.keep(monkey);
		
		Demo22 x = new Demo22();
		x.fun();
		
//		Animal ref;
//		
//		ref = tiger;
//		ref.eat();
//		ref.sleep();
//		ref.food();
//		
//		ref = deer;
//		ref.eat();
//		ref.sleep();
//		ref.food();
//		
//		ref = monkey;
//		ref.eat();
//		ref.sleep();
//		ref.food();
	}

}
