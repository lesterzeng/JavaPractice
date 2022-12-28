// Class go-through practice

package com.accenture.billingsystem.demo;

import java.util.ArrayList;
import java.util.Scanner;


public class LaunchHotelBillv2 {

	public static void main(String[] args) {
		int itemID;
		String itemName = null;
		int quantity = 0;
		int itemPrice = 0;
		int subTotal = 0;
		String choice = "y";
		int grandTotal=0;
		
		ArrayList<Bill> newItem = new ArrayList<Bill>();
		
		System.out.println("Dear customer, welcome to hotel");
		
		Scanner scan = new Scanner(System.in);
		
		while(choice.equals("y")) {
			
		
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Dear " + name + " below is the menu");
		System.out.println("____________________________________");
		System.out.println("ItemID       ItemName     ItemPrice");
		System.out.println("____________________________________");
		System.out.println("1            Water            10");
		System.out.println("2            Pepsi            25");
		System.out.println("3            Pizza            50");
		System.out.println("4            Fries            35");
		System.out.println("5            Burger           40");
		
		System.out.println("Please enter the item ID");
		itemID = scan.nextInt();
		
		System.out.println("Please enter the quantity");
		quantity = scan.nextInt();

		switch(itemID) {
		case 1: itemName = "Water";
				itemPrice = 10;
				subTotal= itemPrice*quantity;
				break;
		case 2: itemName = "Pepsi";
				itemPrice = 25;
				subTotal= itemPrice*quantity;
				break;
		case 3: itemName = "Pizza";
				itemPrice = 50;
				subTotal= itemPrice*quantity;
				break;
		case 4: itemName = "Fries";
				itemPrice = 35;
				subTotal= itemPrice*quantity;
				break;
		case 5: itemName = "Burger";
				itemPrice = 40;
				subTotal= itemPrice*quantity;
				break;
				default:System.out.println("Invalid selection"); 
		}
		System.out.println("Item Name:" + itemName + "        Item Price: " + itemPrice + "      Quantity:" + quantity + "          Subtotal:" +subTotal);

		//////////////
		//		Bill b = new Bill(itemName, itemPrice, quantity, subTotal);
		//^ Object creation of Bill
		//	newItem.add(b)
		//^ passing values into ArrayList 
		//////////////
		// or can write it as below - shortcut
		newItem.add(new Bill(itemName, itemPrice, quantity, subTotal));
		grandTotal += subTotal;
		
		System.out.println("Would you like to order more? y/n");
		choice = scan.next();
		
		System.out.println("__________________________________________________");
		System.out.println("Item name      Item Price       Quantity     Subtotal");
		System.out.println("__________________________________________________");
		for (Bill x:newItem) {
			System.out.println(x);
		}
		// Need to use collection(ArrayList) to store information like itemName, itemPrice, quantity, subTotal
		// Array can't work because it's homogenous.	
		System.out.println("Dear " + name + ", your total bill is " + grandTotal);
		}
	}
}

class Bill{
	String itemName;
	int itemPrice;
	int quantity;
	int subTotal;
	

	public Bill(String itemName, int itemPrice, int quantity, int subTotal) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	
	@Override
	public String toString() {
		return itemName + "        " + itemPrice + "          " + quantity + "           " + subTotal;
	}

	
}
