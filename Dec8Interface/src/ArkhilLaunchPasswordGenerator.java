import java.util.Random;
import java.util.Scanner;
import java.util.UUID;


	 
	 class PasswordGenerator {
		 int i = 0, random, x, len;
		 char upperCase, lowerCase, numbers, symbols;
		 StringBuffer pw = new StringBuffer();
		 Random rand = new Random();
		 Scanner scan = new Scanner(System.in);
		 
		 public void input() {

			 System.out.println("Enter length of password");
			 len = scan.nextInt();
			 
			 System.out.println("Do you want UPPERCASE characters?");
			 upperCase = scan.next().toLowerCase().charAt(0);
			 
			 System.out.println("Do you want LOWERCASE characters?");
			 lowerCase = scan.next().toLowerCase().charAt(0);
			 
			 System.out.println("Do you want NUMBERS?");
			 numbers = scan.next().toLowerCase().charAt(0);
			 
			 System.out.println("Do you want SPECIAL SYMBOLS?");
			 symbols = scan.next().toLowerCase().charAt(0);
			 
		 }
		 
		 public void generate() {
			 while(i<len) {
					
				 random = rand.nextInt(4);
				 switch(random) {
				 case 0: if(upperCase=='y') {
					 	x = rand.nextInt(91);
					 // for JAVA 18
					 	// x=rand.nextInt(65.91){
					 	// pw.append((char)(x));
					 	
					 	while(x>65 && x<=90) {
					 		pw.append((char)(x));
					 		i++;
					 		break;
					}
					 	
				 } break;
				 case 1: if(lowerCase=='y') {
					 	x = rand.nextInt(123);
					 	while(x>97 && x<=122) {
					 		pw.append((char)(x));
					 		i++;
					 		break;
					}
				 } break;
				 case 2: if(numbers=='y') {
					 	x = rand.nextInt(58);
					 	while(x>48 && x<=57) {
					 		pw.append((char)(x));
					 		i++;
					 		break;
					}
				 } break;
				 case 3: if(symbols=='y') {
					 	x = rand.nextInt(91);
					 	while(x>33 && x<=42) {
					 		pw.append((char)(x));
					 		i++;
					 		break;
					}
				 } break;
			
			 }	
			 } 
		 }
		 
		 public void disp() {
			 System.out.println(pw);
		 }
	 }

//		 static String usingRandomUUID() {
//
//		    UUID randomUUID = UUID.randomUUID();
//
//		    return randomUUID.toString().replaceAll("-", "");
//
//		  }
	


public class ArkhilLaunchPasswordGenerator {
	 public static void main(String[] args) {
		 
		 PasswordGenerator pg = new PasswordGenerator();
		 pg.input();
		 pg.generate();
		 pg.disp();


		 
//		    String randomStr = usingRandomUUID();
//
//		    Scanner scan = new Scanner(System.in);     
//
//		        System.out.print("Enter the length password to be generated: ");
//
//		        int len = scan.nextInt();
//
//
//		    System.out.println("A random string of " + len + " characters : " + randomStr);

		   
		 }  
	 
}
