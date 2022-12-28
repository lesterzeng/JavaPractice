package com.accenture.guesser;

import java.util.Scanner;
import java.util.Random;

public class Guesser {
int gnum;

public int guessNum() {
	Random rand = new Random();
//	System.out.println("Guesser, kindly guess a number");
//	Scanner scan = new Scanner(System.in);
//	gnum = scan.nextInt();
	int upperbound = 25;
	gnum = rand.nextInt(upperbound);
	return gnum;
}
}
