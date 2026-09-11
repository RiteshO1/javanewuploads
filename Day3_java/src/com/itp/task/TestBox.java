package com.itp.task;
import java.util.Scanner;
public class TestBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Dimension (l,w,h):");
		double l = sc.nextDouble();	
		double w = sc.nextDouble();
        double h = sc.nextDouble();
        
        Box box1 = new Box(l, w, h);
        System.out.println("Original: " + box1.getDetails());
        
        System.out.println("Enter offsets to add (length offset, width offset, height offset):");
        double lOffset = sc.nextDouble();
        double wOffset = sc.nextDouble();
        double hOffset = sc.nextDouble();
        
        Box box2 = box1.createNewBox(lOffset, wOffset, hOffset);
        System.out.println("New Box: " + box2.getDetails());
	}
}
;