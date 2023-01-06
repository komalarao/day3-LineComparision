package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class FindingLineLength {

	public static void main(String[] args) {
		System.out.println("welcome to line comparision program");
		System.out.println("welcome to line comparision computation program!");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter x coordinates of line:");
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		System.out.println("enter y coordinates of line:");
	    int y1 = scan.nextInt();
		int y2 = scan.nextInt();
		double line_length = Math.sqrt(Math.pow(x2 -x1,2)+Math.pow(y2 -y1,2));
		
		System.out.println("length of the line is:"+line_length);

	}

}
