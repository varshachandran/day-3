package com.niit.Example;

import java.util.Comparator;

public class MySalaryComp implements Comparator<Empl> {
	
	public int compare(Empl e1,Empl e2)
	{
		 if(e1.getsalary()<e2.getsalary()){
			 return 1;
		 }
		 else
		 {
			 return-1;
		 }

}
}
