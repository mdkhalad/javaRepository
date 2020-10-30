package javaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkdLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("kyle");
		ll.add("alina");
		ll.add("tara");
		ll.add("khaled");
		
		ll.addFirst("bivan");
		ll.addLast("tipu");
		
		System.out.println("content of the list:" + ll);
		System.out.println(ll.get(3));
		for(int i = 0; i<ll.size(); i++) {
		System.out.println(ll.get(i));
		
		
		for(String str: ll) {
			System.out.println(ll);
		}
			    Iterator<String> it = ll.iterator();
			    while (it.hasNext()){
			    	System.out.println(it.hasNext());
			    }
			
		}
		}
	}


