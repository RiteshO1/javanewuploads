package com.itp.task;

import java.util.Scanner;

public class TestPoint2D {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x and y ");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("enter x and y ");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("distance betn 2 points");
		p1.calcDistance(p2);
		
		
		
		
	}

}
