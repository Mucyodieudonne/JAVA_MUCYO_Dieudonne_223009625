
/***
=======Names==========
1)MUCYO Dieudonne 223009625
2)UZABAKIRIHO Theogene 223009518
3)IHIMBAZWE Genevieve 223014976
4)NIYOGISUBIZO Benoit 223007262
5)IKIREZI Denyse 223015956
6)UWASHEMA Victorine 223012958
7) UMWARI Justine
***/
package com.case1;
import java.util.Scanner;
public class TestRectangle {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Rectangle n= new Rectangle();
		System.out.println("Enter the Length : ");
		n.setLength(input.nextDouble());
		System.out.println("Enter the Width : ");
		n.setWidth(input.nextDouble());
		System.out.println("The Length is :"+n.getLength());
		System.out.println("The Width is :"+n.getWidth());
		System.out.println("The Area is : "+n.calculateArea());
		
		double A=n.getLength();
		double B=n.getWidth();
		if(A==B){
			System.out.println("The Rectangle is Square.");
		}
		else{
			System.out.println("The Rectangle is not Square.");
		}
	}

}
