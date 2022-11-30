package com.Assignment.app;
import java.util.Scanner;

/*
 * Raju’s basic salary is given. His dearness allowance is 40% of the basic
 * salary and house rent allowance is 20%. Calculate his total salary.
 */
public class QuestionNumber7 {
	public static void calculateTotalSalary(double basicSalary) {
		double dearnessAllowance=basicSalary*0.4;
		double hra=basicSalary*0.2;
		double result=(basicSalary+dearnessAllowance+hra);
		System.out.println("Total salary "+result);
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter basic salary");
			double basicSalary=sc.nextDouble();
			calculateTotalSalary(basicSalary);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
