package com.accenture.billingsystem.rudresh;

import java.util.ArrayList;
import java.util.Scanner;

public class LaunchHotelBillRudreshVersion {
	public static void main(String[] args) {
		int itemID=0;
		String itemName=null;
		int quantity=0;
		int itemPrice=0;
		int subTotal=0;
		String choice = "y";
		int grandTotal=0;
		
		ArrayList<Bill> newItem = new ArrayList<Bill>();
		
		System.out.println("Dear customer, welcome to xyz hotel");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		while(choice.equals("y")) {
			System.out.println("Dear "+ name+", below is the menu");
			System.out.println("______________________________________________________");
			System.out.println("ItemID		ItemName		ItemPrice");
			System.out.println("______________________________________________________");
			System.out.println("1		Water			10");
			System.out.println("2		Pepsi			25");
			System.out.println("3		Pizza			50");
			System.out.println("4		Fries			35");
			System.out.println("5		Burger			40");
			System.out.println("______________________________________________________");
			
			System.out.println("Please enter the item ID");
			itemID = scan.nextInt();
			
			System.out.println("Please enter the quantity");
			quantity = scan.nextInt();
			
			switch(itemID) {
			case 1:itemName = "Water";
					itemPrice = 10;
					subTotal = itemPrice*quantity;
					break;
			case 2:itemName = "Pepsi";
					itemPrice = 25;
					subTotal = itemPrice*quantity;
					break;
			case 3:itemName = "Pizza";
					itemPrice = 50;
					subTotal = itemPrice*quantity;
					break;
			case 4:itemName = "Fries";
					itemPrice = 35;
					subTotal = itemPrice*quantity;
					break;
			case 5:itemName = "Burger";
					itemPrice = 40;
					subTotal = itemPrice*quantity;
					break;
			default:System.out.println("Invalid selection");
					break;
			}
			System.out.println(itemName+"      "+itemPrice+"      "+quantity+"      "+subTotal);
			grandTotal += subTotal;
			newItem.add(new Bill(itemName, itemPrice, quantity, subTotal));
			System.out.println("Do you want to order more(y/n)");
			choice = scan.next();
		}
		System.out.println("___________________________________");
		System.out.println("Item name    Item Price    quantity    Sub Total");
		System.out.println("___________________________________");
		for(Bill x:newItem) {
			System.out.println(x);
		}
		System.out.println("___________________________________");
		System.out.println("Dear "+name+", your total bill is "+grandTotal);
		System.out.println("___________________________________");
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
		return itemName+"        "+itemPrice+"        "+quantity+"        "+subTotal;
	}	
	
	
}