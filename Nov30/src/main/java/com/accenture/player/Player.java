package com.accenture.player;

import java.util.Scanner;

public class Player {
int pnum;

public int guessNum() {
	System.out.println("Player, kindly guess a number");
	Scanner scan = new Scanner(System.in);
	pnum = scan.nextInt();
	return pnum;
}
}
