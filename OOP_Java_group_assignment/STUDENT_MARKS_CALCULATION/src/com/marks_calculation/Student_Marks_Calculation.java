package com.marks_calculation;
import java.util.Scanner;
public class Student_Marks_Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students :");
int n = sc.nextInt();
sc.nextLine();
Student[] students= new Student[n];
for(int i=0; i<n;i++) {
	System.out.println("\nEnter Details of students  :"+(i+1)+":");
	System.out.println("Enter ID :");
	int ID= sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Name :");
	String Name= sc.nextLine();
	
	int[]marks= new int[3];
	for(int j=0;j<3;j++) {
		System.out.println("Enter Marks for the subject :"+(j+1)+":");
		marks[j]= sc.nextInt();	}
	students[i] =new Student(ID, Name, marks);
}
System.out.println("\n -------------Student Details-----------");
for(Student s: students) {
	s.displayStudent();
}
double highestAvg =0;
String topStudentName="";
for (Student s:students) {
	double avg=s.calculateAverage();
	if(avg>highestAvg) {
		highestAvg=avg;
		topStudentName=s.calculateGrade();
		
	}
}
System.out.println("Highets Average Marks : "+highestAvg);
	}

}
