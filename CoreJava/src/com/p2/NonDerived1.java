package com.p2;

import com.p1.Derived;
import com.p1.Protection;

public class NonDerived1 {
	public NonDerived1()
	{
		Protection p=new Protection();
		Derived d=new Derived();
		System.out.println("NonDerived1's Constructor");
		//System.out.println("n : "+p.n);
		System.out.println("n_pub : "+p.n_pub);
		//System.out.println("n_pri : "+p.n_pri);
		//System.out.println("n_pro : "+p.n_pro);
	}

}
