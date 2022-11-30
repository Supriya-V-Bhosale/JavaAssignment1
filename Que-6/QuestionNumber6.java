package com.Assignment.app;
import java.util.Scanner;

/*Two numbers are stored in locations i and j.
 *  Write a program to interchange the numbers.
 */

public class QuestionNumber6 {
	public static void interChangeNumber(int i,int j) {
		System.out.println("Before interchange");
		System.out.println("i:"+ i +" j:" + j);
		System.out.println("After interchange");
		int temp=i;
		i=j;
		j=temp;
		System.out.println("i:"+ i +" j:" + j);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter i value ");
			int i=sc.nextInt();
			System.out.print("Enter j value ");
			int j=sc.nextInt();
			interChangeNumber(i,j);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
