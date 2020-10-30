package javaBasics;

public class Constructor1 {

	
	
	
	 public Constructor1() {
		 System.out.println("defult constructor");
		 
	 }
		
	 public Constructor1(int a ) {
		 System.out.println("one parmeter constructor");
		 System.out.println("the value of a is:" + a);
	 }
	 
	 public Constructor1(int b, int c) {
		 System.out.println("two parametr constructor");
		 System.out.println(" the value of  b and c is : "+ (b+c ));
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor1 obj = new Constructor1();
		Constructor1 obj1 = new Constructor1(10); 
		Constructor1  obj2 = new Constructor1(20,30);
		
		 
	}

}
