package com.velocity1;

import java.util.*;

public class HashmapDemo{
	
	public static void main(String[]args) {
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		map.put(10, "ram");
		map.put(20, "shyam");
		map.put(30,"Kimya");
		
		Set<Integer>s = map.keySet();
		
		Iterator<Integer>itr = s.iterator();
		while(itr.hasNext());
		{
		int i  =itr.next();
		System.out.println("Key = " + i);
		System.out.println("Value==" + map.get(i));
		
	}
}
			
		}