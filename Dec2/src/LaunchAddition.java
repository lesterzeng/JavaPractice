class Addition {
	
	int add(int x, int y) {
		return x+y;
	}
	float add(float x, int y) {
		return x+y;
	}

	float add(float x, float y) {
		return x+y;
	}

	int add(int x, int y, int z) {
		return x+y+z;
	}

	float add(int x, int y, float z) {
		return x+y+z;
	}

	float add(int x, float y, float z) {
		return x+y+z;
	}

	float add(float x, float y, float z) {
		return x+y+z;
	}

}
public class LaunchAddition {

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		float p=15.5f, q=25.5f, r=35.5f;
		
		Addition ad = new Addition();
		System.out.println(ad.add(a, b));
		System.out.println(ad.add(a, p));
		System.out.println(ad.add(q, b));
		
	}

}
