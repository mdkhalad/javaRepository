package javaBasics;

public class B extends A{

	public B() {
		super();
		System.out.println("child class const");
	}
	public B(int i) {
		super(i);
	}
	
	public B(int j, int k) {
		super(j,k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B obj = new B();
   B obj1 = new B(10,20);
	}

}
