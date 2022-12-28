
import java.util.Scanner;
import java.util.Random;

interface Generator
{
	void input();
	void generate();
	void display();
}

class PasswordGenerator1 implements Generator
{
	int i=0, random, x, len;
	char upperCase, lowerCase, numbers, symbols;
	StringBuffer pw = new StringBuffer();
	Random rand = new Random();
	Scanner sc= new Scanner(System.in);
	public void input(){
		System.out.println("Enter the length of the password");
		len = sc.nextInt();
		System.out.println("Do you want UPPERCASE CHARACTERS?");
		upperCase = sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want LOWERCASE CHARACTERS?");
		lowerCase = sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want NUMBERS?");
		numbers = sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want SPECIAL SYMBOLS?");
		symbols = sc.next().toLowerCase().charAt(0);
	}

	public void generate(){
		while(i<len){
		random = rand.nextInt(4);
		switch(random){
		case 0: if(upperCase=='y')
			{
				x = rand.nextInt(91);
				if(x>=65 && x<=90)
				{
					pw.append((char)(x));
					i++;
					break;
				}
			}
			break;
		case 1: if(lowerCase=='y')
			{
				x = rand.nextInt(123);
				if(x>=97 && x<=122)
				{
					pw.append((char)(x));
					i++;
					break;
				}
			}
			break;
		case 2: if(numbers=='y')
			{
				x = rand.nextInt(58);
				if(x>=48 && x<=57)
				{
					pw.append((char)(x));
					i++;
					break;
				}
			}
			break;
		case 3: if(symbols=='y')
			{
				x = rand.nextInt(43);
				if(x>=33 && x<=42)
				{
					pw.append((char)(x));
					i++;
					break;
				}
			}
			break;
		}
		}
	}
	public void display(){
		System.out.println(pw);
	}
}

class Begin
{
	static void start(){
		PasswordGenerator1 pg = new PasswordGenerator1();
		pg.input();
		pg.generate();
		pg.display();
	}
}

public class AkhilLaunchPasswordGeneratorv2 {
	public static void main(String[] args) 
	{
		Begin.start();
	}
}