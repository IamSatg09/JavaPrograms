package com.learning.exercises;

public class SavingsAccount extends Account{

	double balance;
	
	public SavingsAccount(int id,String name) {
		super(id,name);
	}
	
	public void deposit(double amt)
	{
	 this.balance=this.getBalance()+amt;
	}
	
	public static void main(String args[])
	{
		SavingsAccount acc1=new SavingsAccount(2,"santhosh");
	    System.out.println("Savings Account Details");
	    System.out.println("userId:"+acc1.getId());
	    System.out.println("userName:"+acc1.getName());
	    
	    
	    acc1.deposit(1000);
	    System.out.println("Available Balance:"+acc1.balance);
	    
	    
	}
}
