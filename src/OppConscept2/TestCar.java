package OppConscept2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BMW b = new BMW();
		   b.starts(); // method over written
		   b.stop();// inharent 
		   b.refuel();// inharent
		   b.theftSafety(); 
		   b.engine();
		   
		   
		   Car c = new Car();
		   c.start();
		   c.stop();
		   c.refuel();
		   
		   
		   Car c1 = new BMW(); // child class object can be reffer  by parent class refference variable . Its call dynamic polymorphism or run time polymorphosim.
		      c1.start();
		      c1.stop();
		      c1.refuel();
		      
		      BMW b1 = (BMW) new Car();
	}

	
	
		
	
	    
}
