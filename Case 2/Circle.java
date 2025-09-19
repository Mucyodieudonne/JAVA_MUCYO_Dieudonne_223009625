
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

public class Circle {
	private double pi=3.14;
	private double Radius;
	private double area;
	private double circumference;
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area =this.pi*(this.Radius*this.Radius);
	}
	public double calculateArea(){
		return this.pi*(this.Radius*this.Radius);
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference() {
		this.circumference = 2*this.pi*this.Radius;
	}
	public double calculateCircumference(){
		return 2*this.pi*this.Radius;
	}
}
