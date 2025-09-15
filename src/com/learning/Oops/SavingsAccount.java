package com.learning.Oops;

public class SavingsAccount extends Account{  //inheritance extends Account class so Savings Account class also has properties and methods of Account class

	double balance;
	
	public SavingsAccount(int id,String name,int age) {
		super(id,name,age);
	}
	
	public void deposit(double amt)
	{
	 this.balance=this.getBalance()+amt;
	}
	
	public static void main(String args[])
	{
		SavingsAccount acc1=new SavingsAccount(2,"santhosh",20);
	    System.out.println("Savings Account Details");
	    System.out.println("userId:"+acc1.getId());
	    System.out.println("userName:"+acc1.getName());
	    acc1.calculate(100);   //calls the method from parent class
	    
	    acc1.deposit(1000);    //calls the method from own class (child class)
	    System.out.println("Available Balance:"+acc1.balance);
	    
	    
	}
}
