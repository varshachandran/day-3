package com.niit.Example;

public class Empl {
	private String name;
	private int salary;
	public Empl(String n,int s)
	{
		this.name=n;
		this.salary=s;
	}
	public String getname()
	{ 
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setsalary()
	{
		this.salary= salary;
	}
	
	public String toString()
	{
	  return "Name:"+this.name+"--Salary:"+this.salary;	
	} 

}
