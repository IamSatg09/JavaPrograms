package com.learning.exercises;

import java.util.Scanner;

interface bankOperations
{
	 void calculate(double amt);   //implemented abstraction through interfaces
	 double getBalance();
	 
}

public class Account implements bankOperations{

	private int id;                // encapsulate data members & methods Encapsulation using private access modifier
	private String name;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.balance=500;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void calculate(double amt) {
		this.balance=balance+amt;

	}
	

	@Override
	public double getBalance() {
		return this.balance;
	}

	public static void main(String[] args) {

		 Account obj=new Account();
		 obj.setId(1);
		 obj.setName("Sathish");
		 
		 System.out.println("userID:"+obj.getId());
		 System.out.println("UserName:"+obj.getName());
		 
		 System.out.println("Enter the Amount paid for this year");
		 
		 double[] dues= new double[12];
		 
		 Scanner sc=new Scanner(System.in); 
		 
		 for(int i=1;i<=12;i++)
		 {
			 System.out.println("Enter the Amount for the month:"+i);
			 dues[i-1]=sc.nextDouble();
			 obj.calculate(dues[i-1]);
			 
		 }
		 
		 System.out.println("Total Amount is Paid By the User Sathish is:"+obj.balance);
		 
	}



}
