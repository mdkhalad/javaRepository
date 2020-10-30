package javaBasics;

public class Constructor {
	
	public Constructor() {
		System.out.println("defualt constructor");
	}
     
	public Constructor(int i) {
		System.out.println("single parameter");
		System.out.println("value of i :" + i);
	}
	public Constructor(int j , int k ) {
		System.out.println("multi parameter");
		System.out.println("value of j  : " + j);
		System.out.println("value of k  : " + k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Constructor cr = new Constructor();
		Constructor cr1 = new Constructor(10);
		Constructor cr2= new Constructor(20,30);
		
	}

}
