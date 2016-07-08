package com.niit.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("JAVA");
	al.add("C++");
	al.add("PERL");
	al.add("PHP");
	al.add("BASIC");
	
	System.out.println(al);
	System.out.println("does this list contain JAVA"+al.contains ("JAVA"));
	al.add(2, "COBOL");
	System.out.println(al);
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	Iterator<String> itr=al.iterator();
	while(itr.hasNext());
	{
		System.out.println(itr.next());
	}
}
}
