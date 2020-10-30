package javaBasics;

public class singleton1 {

	
	   private static singleton1 singtleton_instance = null;
	   
	   private String str;
	   
	   private singleton1() {
		   str = "practing singleton";
		   
	   }
	public static singleton1 getInstance() {
		if(singtleton_instance == null)
			singtleton_instance = new singleton1();
		return singtleton_instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singleton1  x  = singleton1.getInstance();
		    x.str = (x.str).toUpperCase();
		    System.out.println(x.str);
		
	}

}
