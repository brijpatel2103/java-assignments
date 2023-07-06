package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> MyNumber=new ArrayList<Integer>();
		MyNumber.add(15);
		MyNumber.add(10);
		MyNumber.add(115);
		MyNumber.add(84);
		MyNumber.add(35);
		MyNumber.add(1);
		
		Collections.sort(MyNumber);
		
		for(int i : MyNumber)
		{
			System.out.println(i);
		}
	}


}
