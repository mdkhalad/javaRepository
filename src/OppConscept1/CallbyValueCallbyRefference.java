package OppConscept1;

public class CallbyValueCallbyRefference {

	
	int p ;
	int q ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CallbyValueCallbyRefference obj  = new CallbyValueCallbyRefference();
		int x = 10;
		int y = 20;
		int i = obj.testSum(x, y);// call by value or pass by vlaue.
		
		obj.p = 10;
		obj.q = 20;
		obj.swap(obj);
		System.out.println(obj.p);// call by refference 
		System.out.println(obj.q);
		
	}

	
   public int testSum(int a , int b) {
	    a = 30;
	    b = 40;
	 int c = a+b;
	 return c;
 }
   public void swap(CallbyValueCallbyRefference t) {
	   int temp ;
	   temp = t.p;
	   t.p  = t.q;
	   t.q = temp;
	   
   }
}
