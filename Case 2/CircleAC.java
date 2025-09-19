
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
package com.case2;
import java.util.Scanner;
public class CircleAC{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle n= new Circle();
		System.out.println("Enter the Radius : ");
		n.setRadius(input.nextDouble());
		System.out.println("Choos what to calculate : ");
		System.out.println(" 1. Area : ");
		System.out.println(" 2. circumference : ");
		
		int choice=input.nextInt();
		switch(choice){
		case 1:
			System.out.println("The Area is : "+n.calculateArea());
			break;
		default:
			System.out.println("The circumference is : "+n.calculateCircumference());
		}
		input.close();
	}

}
