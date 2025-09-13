package com.learning.exercises;

import java.util.Scanner;

public class OOPS {

	int id;                // encapsulat data members & methods Encapsulation 
	String name;
	double balance;
	
	public OOPS() {
		super();
	}

	public OOPS(int id, String name,int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance=0;
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
	
	public void Calculate(int amt)    //Compile Time Polymorphism
	{
		this.balance=balance+amt;
	}
	
	public void Calculate(double amt) //Compile Time Polymorphishm
	{
		this.balance=balance+amt;
	}

	public static void main(String[] args) {

		 OOPS obj=new OOPS();
		 obj.setId(1);
		 obj.setName("Sathish");
		 
		 System.out.println("userID:"+obj.getId());
		 System.out.println("UserName:"+obj.getName());
		 
		 System.out.println("Enter the Amount paid for this year");
		 
		 int[] dues= new int[12];
		 
		 Scanner sc=new Scanner(System.in); 
		 
		 for(int i=1;i<=12;i++)
		 {
			 System.out.println("Enter the Amount for the month:"+i);
			 dues[i-1]=sc.nextInt();
			 obj.balance+=dues[i-1];
			 
		 }
		 
		 System.out.println("Total Amount is Paid By the User:"+obj.balance);
		 
	}

}
