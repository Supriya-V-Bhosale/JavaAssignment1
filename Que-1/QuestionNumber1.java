package com.Assignment.app;
import java.util.Scanner;
/*
For 10 oranges we have to pay Rs.45 what will be the price
of 1 orange
*/
public class QuestionNumber1 {
	public static float calculatePrice(int orangeQuantity,float price) {
		float result=price/orangeQuantity;
		return result;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter quantity of oranges ");
	int orangeQuantity=sc.nextInt();
	System.out.print("Enter price for 10 oranges ");
	float price=sc.nextFloat();
	System.out.println(String.format("price for 1 orange : %.2f",calculatePrice(orangeQuantity,price)));
	}
	
}
