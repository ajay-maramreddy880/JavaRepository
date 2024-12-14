package com.coding.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(18);
		list.add(26);
		list.add(32);
		list.add(40);
		
		Iterator<Integer> itr=list.iterator();  
		 while(itr.hasNext()){  
		   System.out.println(itr.next());  
		 }  

	}

}
