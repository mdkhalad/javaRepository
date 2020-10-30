package javaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("manual");
		ll.add("automation");
		ll.add("alm");
		ll.add("jira");

		ll.addFirst("java");
		ll.addLast("pythone");

		System.out.println(ll.size());

		ll.remove("manual");
		ll.remove(3);
		System.out.println(ll);

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		for (String str : ll) {
			System.out.println(str);
		}

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
