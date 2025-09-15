package com.learning.Exceptions;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in))
		{
			int num1=10;
			int num2=0;
			
			int sum=num1/num2;
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally Block Executed");
		}
	}

}
