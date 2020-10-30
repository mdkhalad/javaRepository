package javaBasics;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;
		int b = 20;
		
		if (a<b) {
			System.out.println("a smaller than b");
			
		}
		else {
			System.out.println("a greater than b ");
		}
		 
		int c = 30;
		int d = 40;
		
		if (c == d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		int a1 = 50;
		int b1 = 60;
		int c1 = 70;
		
		
		if (a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest ");
		}
		else if (b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest ");
		}
	}

}
