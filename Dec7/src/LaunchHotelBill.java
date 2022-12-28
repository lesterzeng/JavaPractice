import java.util.Scanner;

class Menu{
	String itemId;
	String itemName;
	int itemPrice;
	int itemQuantity;
	int subtotal;
	
	void takeInput() {
		System.out.println("Enter ItemId");
		Scanner scan1 = new Scanner(System.in);
		itemId = scan1.nextLine();
		
		System.out.println("Enter quantity");
		Scanner scan2 = new Scanner(System.in);
		itemQuantity = scan2.nextInt();
		
	}
	
	void disp() {
		System.out.println("____________________________________");
		System.out.println("ItemID       ItemName     ItemPrice");
		System.out.println("____________________________________");
		System.out.println("1            Water            10");
		System.out.println("2            Pepsi            25");
		System.out.println("3            Pizza            50");
		System.out.println("4            Fries            35");
		System.out.println("5            Burger           60");
	}
}

class Water extends Menu{
	
}

class Burder extends Menu{
	
}

class Pizza extends Menu{
	
}

class Fries extends Menu{
	
}

class User{
	String userName;
	
	void takeInput() {
		System.out.println("Please enter your name");
		Scanner scan = new Scanner(System.in);
		userName = scan.nextLine();
	}
	void disp() {
		System.out.println("Dear " + userName + " below is the menu");
	}
}

class Bill extends Menu {
	int[] orderSummary;
	void compilation(String itemName, int itemPrice, int itemQuantity, int subtotal) {
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemQuantity=itemQuantity;
		this.subtotal=subtotal;
		
	}
	void disp() {
		
	}
}

public class LaunchHotelBill {

	public static void main(String[] args) {
		System.out.println("Welcome to hotel");
		User u = new User();
		u.takeInput();
		u.disp();
		Menu m = new Menu();
		m.disp();
		m.takeInput();
	}

}
