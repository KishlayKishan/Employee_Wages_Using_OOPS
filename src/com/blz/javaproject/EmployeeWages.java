package com.blz.javaproject;

import java.util.Random;

public class EmployeeWages {

	public static void EmpWageUC1() {
		Random ran = new Random();
		int present = 1;
		int empCheck = ran.nextInt(2);
		if (empCheck == present) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Using OOP's Concept");
		
		EmpWageUC1();
	
	}
	

}


