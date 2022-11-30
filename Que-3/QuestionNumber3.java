package com.Assignment.app;
import java.util.Scanner;
/*
 * Read two numbers, divide the first number by the second and 
 * print the quotient and remainder.
 */
public class QuestionNumber3 {
	
	public static void calculateQuotient(int firstNumber,int secondNumber) {
		System.out.println("Quotient of " + firstNumber +" and "+ secondNumber + " : "+ firstNumber/secondNumber);
	}
	
	public static void calculateRemainder(int firstNumber,int secondNumber) {
		System.out.println("Reamainder of " + firstNumber +" and "+ secondNumber + " : "+ firstNumber%secondNumber);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Enter first Number: ");
		int firstNumber=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNumber=sc.nextInt();
		calculateQuotient(firstNumber,secondNumber);
		calculateRemainder(firstNumber,secondNumber);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
