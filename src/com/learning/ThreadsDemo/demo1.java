package com.learning.ThreadsDemo;

public class demo1{

	 
	public static void main(String args[])
	{
		Runnable obj1=new Runnable() {  //anonymous class
			
			public void run()
			{
				for(int i=1;i<=10;i++)
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
		};
       Runnable obj2=new Runnable() {   //anonymous class
			
			public void run()
			{
				for(int i=1;i<=10;i++)
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
		};
		
//		System.out.println("Priority of obj1:"+obj1.getPriority());
//		obj2.setPriority(Thread.MAX_PRIORITY);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		
	}
}
