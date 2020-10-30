package javaBasics;

public class Singleton {

	
	       private static Singleton singleton_instance = null;
	       public String str;
	       
	       
	     private Singleton() {
	    	 str = "using singleton";
	     }
	
	  public static Singleton getInstace() {
		  if(singleton_instance == null) 
			  singleton_instance = new Singleton();
		  return singleton_instance;
	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x = Singleton.getInstace();
		Singleton y = Singleton.getInstace();
		
		 x.str =  (x.str).toUpperCase();
		 System.out.println(x.str);
		 
		 x.str = (x.str).toLowerCase();
		 System.out.println(x.str);
		
	}

}
