package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101, "Krish");
		map.put(901, "Tanmay");
		map.put(712, "Anil");
		 map.put(152, "Brijesh");
		
		System.out.println(map);
		System.out.println(map.get(152));
		System.out.println(map.entrySet());
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
