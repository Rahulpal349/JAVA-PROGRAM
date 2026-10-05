package com.java.program;

public class CreateObject 
{
	public static void main(String args[])
	{
		
		Constructor1 constructor = new Constructor1("Rohit", 20, "Kolkata");
		
		System.out.println("Name : " + constructor.name);
		System.out.println("Age : " + constructor.age);
		System.out.println("Location : " + constructor.location);
	}
}
