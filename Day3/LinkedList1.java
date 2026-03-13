package com.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList LinkedList = new LinkedList<>();
		
		LinkedList.add("A");
		LinkedList.add("B");
		LinkedList.add("C");
		LinkedList.add("D");
		LinkedList.add("E");
		
		System.out.println(LinkedList);
		
		System.out.print("Iterator: ");
		Iterator iterator = LinkedList.iterator();
		while (iterator.hasNext()) {
			Object e = iterator.next();
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.print("ListIterator forward: ");
		ListIterator listIterator = LinkedList.listIterator();
		while (listIterator.hasNext()) {
			Object e = listIterator.next();
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.print("ListIterator backward: ");
		while (listIterator.hasPrevious()) {
			Object e = listIterator.previous();
			System.out.print(e + " ");
		}
		System.out.println();
		
	}

}

