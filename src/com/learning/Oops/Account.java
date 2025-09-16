package com.learning.Oops;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.learning.Exceptions.InValidAgeException;

interface bankOperations   //it's now a functional interface has one abstract method only & default & static methods as per java8
{
	 void calculate(double amt);   //implemented abstraction through interfaces
	 
	 default void printWelcome()
	 {
		 System.out.println("welcome to  java 8 banking system");
		 
	 }
	 
	 static void bankInfo()
	 {
		 System.out.println("bank operations interface provided by java 8 ");
	 }
}

public class Account{

	private int id;                // encapsulate data members & methods Encapsulation using private access modifier
	private String name;
    private int Age;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int id, String name,int age) {
		super();
		this.id = id;
		this.name = name;
		this.balance=500;
		this.Age=age;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws InValidAgeException {
		 if(age<18)throw new InValidAgeException("Age is Not Valid");
		Age = age;
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
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 

		 Account obj=new Account();

		try {
		 System.out.println("Enter UserID");
		 int id=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter UserName");
		 String name=sc.nextLine();
		 
		 System.out.println("Enter Age");
		 int Age=sc.nextInt();
		 
	
		 obj.setId(id);
		 obj.setName(name);
		 obj.setAge(Age);
		 
		 bankOperations bo=amt->obj.setBalance(obj.getBalance()+amt); //lambda expression
		 
		 System.out.println("userID:"+obj.getId());
		 System.out.println("UserName:"+obj.getName());
		 bankOperations.bankInfo();
		
		 
		 System.out.println("Enter the Amount paid for this year");
		 
		
		 
		 double[] dues= new double[12];
		 
		 
		 for(int i=1;i<=12;i++)
		 {
			 System.out.println("Enter the Amount for the month:"+i);
			 dues[i-1]=sc.nextDouble();
			 bo.calculate(dues[i-1]);
			 
		 }
		 
		 System.out.println("Total Amount is Paid By the User Sathish is:"+obj.balance);
		}
		catch(Exception e)
		{
		 System.out.println("Exception:"+e.getMessage());
		 e.printStackTrace();
			return;
		}
	}
		




}
