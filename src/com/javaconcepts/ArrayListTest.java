package com.javaconcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	List<Integer> mark_list = new ArrayList<>();
	
	List<Integer> mark_list1 = new LinkedList<>();
	
	public void arrTest() {
		mark_list.add(67);
		mark_list.add(67);
		mark_list.add(78);
		mark_list.add(34);
		mark_list.add(56);
		mark_list.add(null);
		mark_list.add(98);
		mark_list.add(98);
		mark_list.add(56);
		mark_list.add(0);
	}
	
	public void arrTest1() {
		mark_list1.add(67);
		mark_list1.add(45);
		mark_list1.add(78);
		mark_list1.add(37);
		mark_list1.add(56);
		mark_list1.add(null);
		mark_list1.add(96);
		mark_list1.add(98);
		mark_list1.add(53);
		mark_list1.add(0);
	}
	
	public void addAllTest() {
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
		mark_list.addAll(mark_list1);
		
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
	}
	
	public void removeAllTest() {
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
		mark_list1.removeAll(mark_list);
		
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
	}
	public void retainAllTest() {
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
		mark_list.retainAll(mark_list1);
		
		System.out.println(mark_list);
		System.out.println(mark_list1);
		
	}
	
	public void listIteratorTest() {
		ListIterator<Integer> itr = mark_list.listIterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------reverse----------");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	
	
	
	}
	
	public static void main(String[] args) {
		ArrayListTest al = new ArrayListTest();
		al.arrTest();
		al.arrTest1();
		//al.addAllTest();
		//al.removeAllTest();
		al.retainAllTest();
		al.listIteratorTest();
		
	}

}
