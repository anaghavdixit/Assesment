package com.lulu.assesment;

import java.util.Scanner;

public class SchoolRecords {
	Scanner sc=new Scanner(System.in);
	String schoolname=sc.next();
	String SchoolAddress=sc.next();
	int SchoolID=sc.nextInt();
	void addRecords() {
		System.out.println("Records added");
	}
	void dispRecords(){
		System.out.println("Displaying the Records:");
		System.out.println(schoolname);
		System.out.println(SchoolAddress);
		System.out.println(SchoolID);
	}
	public static void main(String[] args) {
		System.out.println("Enter the records:");
		SchoolRecords r=new SchoolRecords();
		r.addRecords();
		r.dispRecords();
		System.out.println("Above are the list of records");
		}
	
}


	

