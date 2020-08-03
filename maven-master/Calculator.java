package com.junitexamples;
import java.util.*;
public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		int a,b;
		System.out.println("1.add\n 2.sub\n3.mul\n3.div\n Enter your choice:");
		int ch;
		ch=sc.nextInt();
		System.out.println("Enter 2 integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		switch(ch) {
			case 1:
				System.out.println("add:"+c.add(a, b));
				break;
			case 2:
				System.out.println("sub:"+c.sub(a, b));
				break;
			case 3:
				System.out.println("mul:"+c.mul(a, b));
				break;
			case 4:
				System.out.println("div:"+c.div(a, b));
				break;
	}
}
}