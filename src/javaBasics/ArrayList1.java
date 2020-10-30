package javaBasics;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList ar = new ArrayList();
	          ar.add(100);
	          ar.add(200);
	          ar.add(300);
	          ar.add("a");
	          ar.add("b");
	          
	          System.out.println(ar.size());
		
	          System.out.println(ar.get(1));
	          
	          for (int i =0 ; i<ar.size(); i++) {
	        	  System.out.println(ar.get(i));
	          }
		
	          
	          ArrayList <Integer> ar1 = new ArrayList<Integer>();
	          
	          ar1.add(100);
	          
	}

}
