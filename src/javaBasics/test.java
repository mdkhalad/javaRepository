package javaBasics;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test3();
		division();

	}

	public static void test3() {
		try {
			System.out.println("test=========== 3");
		} catch (Exception e) {
			System.out.println("excption");
		} finally {
			System.out.println("execute the code anyway");
		}
	}

	public static void division() {
		     try{
		    	 
		    	 int i = 5/0;
		    	//System.out.println(i); 
		      	System.out.println("inside the try block");
		     }catch(NullPointerException e ){
		    	 System.out.println("inside the catch block");
		     }
	   
	finally { 
		System.out.println("execute");
	}

}
}