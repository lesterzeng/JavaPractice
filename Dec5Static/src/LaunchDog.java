// Count number of objects created, using Static count

class Dog{
	String name;
	String color;
	int cost;
	static int count;

// Method 1
	
	Dog(){
		count++;
	}
	
	Dog(String name) {
		count++;
	}
	
	Dog(String name, String color, int cost){
		count++;
	}



	// Method 2
//	
//	{
//		count++;
//	}
	
	// it will execute the above ^ non-static block before constructor below
	
//	Dog(){
//		
//	}
//	
//	Dog(String name) {
//		
//	}
//	
//	Dog(String name, String color, int cost){
//		
//	}
	
//////////////////////
	
}








public class LaunchDog {

	public static void main(String[] args) {
		System.out.println(Dog.count);
		Dog d1 = new Dog();
		System.out.println(Dog.count);
		Dog d2 = new Dog("Ruby");
		System.out.println(Dog.count);
		Dog d3 = new Dog("Lobo", "White", 1000);
		System.out.println(Dog.count);	
	}

}
