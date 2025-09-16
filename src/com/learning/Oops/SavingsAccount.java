package com.learning.Oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SavingsAccount extends Account{  //inheritance extends Account class so Savings Account class also has properties and methods of Account class

	double balance;
	
	public SavingsAccount(int id,String name,int age) {
		super(id,name,age);
		balance=super.getBalance();
	}
	
	public void deposit(double amt)
	{
        this.balance=this.balance+amt;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + this.balance + ", getAge()=" + getAge() + ", getId()=" + getId() + ", getName()="
				+ getName();
	}

	public static void main(String args[])
	{
		SavingsAccount acc1=new SavingsAccount(2,"santhosh",20);
	    System.out.println("Savings Account Details");
	    System.out.println("userId:"+acc1.getId());
	    System.out.println("userName:"+acc1.getName());
	    acc1.deposit(100);   //calls the method from parent class
	    
	    acc1.deposit(1000);    //calls the method from own class (child class)
	    System.out.println("Available Balance:"+acc1.getBalance());
	    
	    SavingsAccount acc2=new SavingsAccount(3,"sathish",22);
	    System.out.println("Savings Account Details");
	    System.out.println("userId:"+acc1.getId());
	    System.out.println("userName:"+acc1.getName());
	    acc1.deposit(100);   //calls the method from parent class
	    
	    acc2.deposit(1000);    //calls the method from own class (child class)
	    System.out.println("Available Balance:"+acc1.getBalance());
	    acc1.deposit(1000);
	    acc2.deposit(1000);
	    acc1.deposit(100);
	    ArrayList<SavingsAccount>userList=new ArrayList<>();
	    userList.add(acc1);
	    userList.add(acc2);
	    
	    System.out.println(userList.get(0));
	    
	    Iterator<SavingsAccount>it=userList.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().toString());
	    }
	    
	    List<SavingsAccount>userlist2=Arrays.asList(
	    		new SavingsAccount(3,"shan",22),
	    		new SavingsAccount(4,"shankar",24),
	    		new SavingsAccount(5,"matti",26),
	    		new SavingsAccount(6,"siva",27)
	    		);
	    
	    Iterator<SavingsAccount>it2=userlist2.iterator();
	    while(it2.hasNext())
	    {
	    	System.out.println(it2.next().toString());
	    }

	    List<SavingsAccount>AgedList=userlist2.stream().filter(acc->acc.getAge()>=24).collect(Collectors.toList());
	    
	    for(SavingsAccount obj:AgedList)
	    {
	    	System.out.println(obj.getName());
	    }
	    
	    
	    
	    
	}
}
