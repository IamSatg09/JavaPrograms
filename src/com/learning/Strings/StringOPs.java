package com.learning.Strings;

public class StringOPs {

	
	public static void main(String args[])
	{
		String str1="Welcome to Java";
		String str2="Welcome to Java";
		String str3="Welcome to java";
		
		
		System.out.println(str1==str2);  //true because string literals stores in string pool same literal always refers same address
		System.out.println(str2==str3);  //false
		System.out.println(str3==str1);   //false    cause case sensitive
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		String str4=new String("Welcome to Java");  //creates new object cuz of new keyword
		System.out.println("-----------");
		System.out.println(str3==str4);            //so became false


			
	}
}
