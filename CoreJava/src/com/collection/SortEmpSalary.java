package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEmpSalary implements Comparator<Emp>
{

	public int compare(Emp e1, Emp e2) {
		int value=0;
		if(e1.getSalary()>e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value ;
	}
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<Emp>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Shail");
		e1.setSalary(50000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Anil");
		e2.setSalary(30000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Tamnay");
		e3.setSalary(45000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Saurabh");
		e4.setSalary(35000);
		
		Emp e5=new Emp();
		e5.setEid(5);
		e5.setEname("Brijesh");
		e5.setSalary(60000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new SortEmpSalary());
		for(Emp e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" ESALARY : "+e.getSalary());
		}
	}

}
