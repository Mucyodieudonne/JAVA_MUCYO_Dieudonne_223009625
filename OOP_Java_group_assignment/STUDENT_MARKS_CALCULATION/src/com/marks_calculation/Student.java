package com.marks_calculation;

public class Student {
	private int ID;
	private String Name;
	private int[] marks =new int[3];
	
	public Student(int iD, String name, int[] marks) {
		super();
		ID = iD;
		Name = name;
		this.marks = marks;
	}
	public double calculateAverage() {
		int sum = 0;
		for(int marks: marks) {
			sum += marks;
		}
		return sum/3.0;
	}
	public String calculateGrade() {
		double avg=calculateAverage();
		if(avg>=80) {
			return "A";}
		else if(avg>=60) {
			return "B";
		}
		else if(avg>=40) {
			return "C";
		}
		else {
			return "Fail";
		}
	}
	public void displayStudent() {
		System.out.println("ID :"+ID);
		System.out.println("Name :"+Name);
		System.out.println("Average :"+calculateAverage());
		System.out.println("Grade:"+calculateGrade());
		System.out.println("-----------------------------");
	}

}
