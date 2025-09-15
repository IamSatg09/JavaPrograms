package com.learning.Strings;

public class StringOPs {

	public static int LengthOfLongestSubString(String s)
	{
		return 0;
	}
	public static String ReverseString(String s)
	{
		int length=s.length();
		String reversed="";
		for(int i=length-1; i>=0; i--)
		{
			reversed+=s.charAt(i);
		}
		return reversed;
	}
	public static boolean checkPalindrome(String s)
	{
		int length=s.length();
		int i=0; int j=length-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		  
			i++;
			j--;
		}
		return true;
	}
	public static boolean CheckPali2(String s)
	{
		s=s.replaceAll(s, "").toLowerCase();
		int length=s.length();
		if(length==0)
			return false;
		for(int i=0;i<length/2;i++)
		{
			if(s.charAt(i)!=s.charAt(length-i-1))
				return false;
			
		}
		return true;
		
	}
	
	public  static int vowelCount(String s)
	{
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
			count++;
		}
		return count;
	}
	public static int vowelCount2(String s)
	{
		int count=0;
		String vowel="aeiouAEIOU";
		for(int i=0;i<s.length();i++)
		{
			if(vowel.contains(s.charAt(i)+""))
					count++;
		}
		return count;
	}
	
	public static long vowelCountUsingStreams(String s)
	{
		return s.toLowerCase().chars().filter(c->"aeiou".indexOf(c)!=-1).count();
	}
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
		
		String str4=new String("Java");  //creates new object cuz of new keyword
		System.out.println("-----------");
		System.out.println(str3==str4);            //so became false

       System.out.println(checkPalindrome("Hello"));
       System.out.println(CheckPali2("madaM"));
       System.out.println(vowelCount("aeiou"));
       System.out.println(vowelCountUsingStreams("aeiouAEIOU"));

                      
			
	}
}
