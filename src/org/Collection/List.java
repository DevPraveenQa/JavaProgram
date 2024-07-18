package org.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println("Empty List + " + al);
		al.add(100);
		al.add(90);
		al.add(80);
		al.add(70);
		al.add(100);
		al.add(90);
		al.add(1, "leela");

		al.add("praveen");
		System.out.println("index of = " + al.indexOf(90));
		System.out.println(al.contains(10));

		System.out.println(al);

		al.retainAll(al);
		System.out.println(al);

		// LinkedList
		LinkedList ll = new LinkedList();
		ll.addAll(al);

		ll.add(30);
		ll.add(20);
		ll.add(60);
		ll.add(20);

//		ll.addLast("kumar");
//		ll.addFirst("naveen");
		System.out.println(ll);

		Vector vl = new Vector();

		vl.add(ll);
		System.out.println(vl);

	}
}
