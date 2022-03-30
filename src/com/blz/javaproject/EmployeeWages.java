package com.blz.javaproject;

import java.util.Random;
public class EmployeeWages {
	

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private String company = "";
	private int empRatePerHour = 0;
	private int numOfWorkingDays = 0;
	private int maxHoursPerMonth = 0;

	public EmployeeWages(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public static void totalEmpWage() {
		EmployeeWages Mart = new EmployeeWages("BigBazaar", 40, 20, 100);
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		while (totalWorkingDays < Mart.numOfWorkingDays && totalWorkingHours < Mart.maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {

			case IS_PART_TIME -> empHrs = 4;

			case IS_FULL_TIME -> empHrs = 8;

			default -> empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * Mart.empRatePerHour;
			System.out.println("day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("salary of " + Mart.company + " employee is " + totalEmpWage);

	}


	public static void main(String[] args) {
		totalEmpWage();

	}
}
