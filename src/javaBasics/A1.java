package javaBasics;

public class A1 {

	
	public A1() {
		System.out.println("parent class constructor");
	}
	
    public A1(int a ) {
    	System.out.println("singale parmeter construc:" + a);
    }
    public A1(int i , int j) {
    	System.out.println("multi" + (i+j));
    }
}


