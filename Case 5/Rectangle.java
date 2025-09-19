
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
package com.case5;
public class Rectangle {
	private double length;
    private double width;
    private double area;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = this.length*this.width;
	}
	public double calculateArea(){
		return this.length*this.width;
	}
    }