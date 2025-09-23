package com.learning.ThreadsDemo;

 class A extends Thread{
	 public void run()
	 {
		 for(int i=1;i<=100;i++)
		 {
		 System.out.println("hi");
		 try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	 }
}
 
 class B extends Thread{
	 public void run()
	 {
		 for(int i=1;i<=100;i++)
		 {
		 System.out.println("hello");
		 try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	 }
 }
public class demo1{

	
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
//		System.out.println("Priority of obj1:"+obj1.getPriority());
//		obj2.setPriority(Thread.MAX_PRIORITY);
		
		obj1.start();
		obj2.start();
		
	}
}
