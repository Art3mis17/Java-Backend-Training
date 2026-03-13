package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrList {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		System.out.print("2.Iterator: ");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object e = iterator.next();
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.print("3.ListIterator forward: ");
		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Object e = listIterator.next();
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.print("4.ListIterator backward: ");
		while (listIterator.hasPrevious()) {
			Object e = listIterator.previous();
			System.out.print(e + " ");
		}
		System.out.println();
		
	}

}
