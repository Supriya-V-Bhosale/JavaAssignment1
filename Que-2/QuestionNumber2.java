package com.Assignment.app;
import java.util.Scanner;

/*Ramu visited the bookstore to buy books for his kid. He bought notebooks for
  Rs.100 and magic pot for Rs.50.How much money did Ramu spend in the bookstore?
*/
public class QuestionNumber2 {
	
	public static int calculateMoney() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter book price: ");
		int bookPrice=sc.nextInt();
		System.out.print("Enter magic pot price: ");
		int magicPot=sc.nextInt();
		int result=bookPrice-magicPot;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Ramu spend money on book: " +calculateMoney());
	}
	

}
