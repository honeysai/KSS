package com.java.basic;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		java.lang.String s1="Hello";
		java.lang.String s2="hellO";
		java.lang.String s3="mehlo";
		java.lang.String s4="hemlo";
		java.lang.String s5="flag";
		int i=s1.hashCode();
		int i2=s3.hashCode();
		int i3=s4.hashCode();
		int i4=s5.hashCode();
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		System.out.println(s1.compareTo(s2));//equal so 0 same
		System.out.println(s1.compareTo(s3));//s1<s3
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));//s1>s3
		
		System.out.println(s1.concat(" how are you !"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,3));
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		System.out.println(s1.charAt(2));
		

	}
 
}
