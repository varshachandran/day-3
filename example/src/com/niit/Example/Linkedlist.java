package com.niit.Example;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		{
			LinkedList<Empl> list=new LinkedList<Empl>();
			list.add(new Empl("gim",400));
			list.add(new Empl("rim",600));
			list.add(new Empl("jim",500));
			list.add(new Empl("kim",700));
			
		Collections.sort(list,new MySalaryComp());
		System.out.println("sorted list");
		for(Empl e:list)
		{
			System.out.println(e);
		}
	}
	}
}
			 
		