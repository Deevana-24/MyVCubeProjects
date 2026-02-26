package com.vcube.methods;
import java.util.Scanner;

public class ScannerEx {

	String name;
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String n  = sc.nextLine();
		
		System.out.println("Hi "+n);
		sc.close();
	}

}
