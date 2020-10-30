package javaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          test1();
		division();
	}
	public static void test1() {
		try {
			System.out.println("Inside test method 1");
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally{
			System.out.println("execute this code");
		}
	}
	 public static void division() {
			int i =  10;
			try {
				System.out.println("inside try block");
				int k = i/0;
			}
			catch(ArithmeticException e) {
				System.out.println("inside catch block");
			}
			finally {
				System.out.println("execute the code ");
			}
		}
	}



