package javaBasics;

public class B1 extends A1{

	
	public B1()  {
		
		
	}
	
	public B1(int i, int j ) {
		super(i,j);
	}
	public B1(int a) {
		super(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 obj  = new B1();
		   
		
		  B1 obj1 = new  B1(570);
		  B1 obj2 = new   B1 (50, 60 );
		
	}
}
