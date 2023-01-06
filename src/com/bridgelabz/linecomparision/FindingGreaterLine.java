package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class FindingGreaterLine {

	public static void main(String[] args) {
		int x1, x2, y1, y2, m1, m2, n1, n2;
        double length, Length_2;

        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first two co-ordinates:");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter second two co-ordinates:");
        x2=sc.nextInt();
        y2=sc.nextInt();
        length=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println("Length of the line:" + length);
        System.out.println("Enter third co-ordinates:");
        m1=sc.nextInt();
        n1=sc.nextInt();
        System.out.println("Enter fourth co-ordinates:");
        m2=sc.nextInt();
        n2=sc.nextInt();
        Length_2=Math.sqrt(Math.pow((m2-m1), 2)+Math.pow((n2-n1), 2));
        System.out.println("Length of the line:" + Length_2);
        String str1=Double.toString(length);
        String str2=Double.toString(Length_2);

        double check = str1.compareTo(str2);
        if(check == 0)
            System.out.println("The two lines are equal");
        else if(check < 0.0)
            System.out.println("Line1 is smaller than Line2");
        else
            System.out.println("Line1 is greater than Line2");
        sc.close();


	}

}
