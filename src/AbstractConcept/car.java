package AbstractConcept;

public class car {

	 String  name = "john";
	 static int age = 20;
	 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		sum();
		car.sum();
		System.out.println(car.age);
		System.out.println(age);
		 car c = new car();
		  c.send();
		
		
	}
	
	      public void send() {
		System.out.println("send mail");
	}
	      
	      public static void  sum() {
	    	  System.out.println("sum method");
	      }
}