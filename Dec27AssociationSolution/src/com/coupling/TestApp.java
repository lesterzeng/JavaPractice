package com.coupling;

public class TestApp {
	public static void main(String[] args) {
		
		Student s=new Student();
		Bike bike=new Bike("Ninj1000",14.5f);
		Book book=new Book("SpringFramework","James");
		
		System.out.println("!-- Tightly Coupled Objects--!");
		System.out.println(s.brain.getIQ()+" "+s.brain.getWeight());
		System.out.println(s.heartBeat.getHr()+"\n"+s.heartBeat.getWeight()+"\n"+s.heartBeat.getSpo2());
     
		System.out.println("!-- Loosly Coupled Objects--!");
		s.has_A(bike); s.has_A(book);
		System.out.println(s.bike.getName()+" "+s.bike.getMilage());
		System.out.println(s.book.getName()+" "+s.book.getAuthor());
		
		s=null;
		
		System.out.println("After discarding the Main Object");
		System.out.println("!-- Tightly Coupled Objects--!");
		System.out.println(s.brain.getIQ()+" "+s.brain.getWeight());
		System.out.println(s.heartBeat.getHr()+"\n"+s.heartBeat.getWeight()+"\n"+s.heartBeat.getSpo2());
     
		
		System.out.println("!-- Loosly Coupled Objects--!");
		s.has_A(bike); s.has_A(book);
		System.out.println(s.bike.getName()+" "+s.bike.getMilage());
		System.out.println(s.book.getName()+" "+s.book.getAuthor());
		
		
	}
}
