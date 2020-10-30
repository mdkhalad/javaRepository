package javaBasics;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Hashtable h = new Hashtable();
             h.put(1, 100);
             h.put("A", "test");
             h.put("c", 200);
             h.put(1, "C");
             
             
             System.out.println(h.size());
             
             
             Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
             h1.put(100, 200);
             
             Hashtable<String ,String> h2 = new Hashtable<String,String>();
             h2.put("a", "hi");
             
                
	}

}
