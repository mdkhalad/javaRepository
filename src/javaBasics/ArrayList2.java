package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList ar = new ArrayList();
		
		        ar.add(100);
		        ar.add("a");
		        ar.add(30);
		        ar.add(40);
		        
		        
		        for (int i =0 ; i<ar.size(); i++) {
		        	  System.out.println(ar.get(i));
		          }
		      //  ArrayList<E> ar1 = new ArrayList<E>();
		       Employee e1 = new Employee(10,"kyle","It");
		       Employee e2 = new Employee(4,"alina","1");
		       Employee e3 = new Employee(32,"tara","dunkind");
		       
		       ArrayList<Employee> ar1 =  new ArrayList<Employee>();
		       ar1.add(e1);
		       ar1.add(e2);
		       ar1.add(e3);
		       
		        Iterator<Employee> it = ar1.iterator();
		        while (it.hasNext()) {
		           Employee em = it.next();
		           System.out.println(em.age);
		           System.out.println(em.dept);
		           System.out.println(em.name);
		        }
		        ArrayList ar2 = new ArrayList();
				
		        ar.add(100);
		        ar.add("a");
		        ar.add(30);
		        ar.add(40);
		        
		        
		        ArrayList ar3 = new ArrayList();
				
		        ar.add(2000);
		        ar.add("abcd");
		        ar.add(3000);
		        ar.add(40000);
		        
		        ar2.addAll(ar3);
		        
		        
		        for(int i = 0; i<ar2.size(); i++) {
		        	System.out.println(ar2.get(i));
		        }
}
}