package com.javaconcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	
	public void hashTest() {
		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(23);
		hs.add(45);
		hs.add(56);
		hs.add(21);
		hs.add(34);
		hs.add(23);
		hs.add(null);
		hs.add(56);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(46));
		System.out.println(hs.remove(45));
		System.out.println(hs);
		
		for(Integer i : hs) {
			System.out.println(i);
		}
		
		
		System.out.println("----------Iterator-------------");
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(next);
		}	
	}
	
	public static void main(String[] args) {
		SetTest s = new SetTest();
		s.hashTest();
	}
	

}
