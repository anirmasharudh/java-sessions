package Empackage;
//package com.nt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		// way 1
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		// way 2 Enumeration
		Enumeration<Integer> e = v.elements();

		while (e.hasMoreElements()) {
			int a = e.nextElement();// it can work with only legacy classes
			System.out.println(a);// can only read the data can not remove
		}

		// way 3 Iterator
		Iterator<Integer> i = v.iterator();
		while (i.hasNext()) {
			int a = i.next();// it can work with all the classes legacy non legacy and it can remove
			if (a == 30)
				i.remove();
			// can only read and remove the data can not add
			// it is unidirectional cursor not bi directional
		}

		// way 4 ListIterator
		ListIterator<Integer> e2 = v.listIterator();
		while (e2.hasNext()) {
			int a = e2.next();
			if (a == 30)
				e2.add(35);
			if (a == 40)
				e2.set(45);

		}

		// way 5 enhance for loop
		for (Integer I : v) {
			System.out.println(I);
		}
	}

}
//type saftey
//any type of value