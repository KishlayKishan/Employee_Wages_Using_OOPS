package com.blz.javaproject;

public class EmployeeWages {

	public static void calculatingEmployeeWage(String company,int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		int empWorkingHour=0;
		int totalWorkingPerHour=0;
		int totalWorkingDay=0;

		while(totalWorkingDay <= numberOfWorkingDays && totalWorkingPerHour < empRatePerHour) {
			totalWorkingDay++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			switch(empCheck) {
			case 1:
				empWorkingHour = 8;
				break;
			case 2 :
				empWorkingHour = 4;
				break;
			default : 
				empWorkingHour = 0;
				break;
			}

			totalWorkingPerHour+=empWorkingHour;
			System.out.println("Day :"+totalWorkingDay);
			System.out.println("Total Employee working hour  is  : " + empWorkingHour);

		}
		int totalEmployeewage = totalWorkingPerHour * empRatePerHour;
		System.out.println("Total Employee Wage is : " + totalEmployeewage);
		System.out.println("Total working hours are  : " + totalWorkingPerHour);

	}


	public static void main(String[] args) {

		System.out.println("Tech Mahindra : ");
		calculatingEmployeeWage("Tech Mahindra ", 120, 30, 10);
		System.out.println("\nWipro : ");
		calculatingEmployeeWage("Wipro ", 125, 8, 80);
	}
}