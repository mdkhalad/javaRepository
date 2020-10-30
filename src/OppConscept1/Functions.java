package OppConscept1;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Functions obj = new Functions();
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		int j = obj.division(30, 10);
		System.out.println(j);
		
	}
  public void test() {
	  System.out.println("test method");
  }
  public int  pqr() {
	  System.out.println("pqr method");
	 int  a = 10;
	 int b = 20;
	 int c = a+b;
	 return c;
	  
  }
  public String qa() {
	  System.out.println("qa method");
	  String s = "selenium";
	  return s;
  }
  public int division(int  x, int  y) {
	  System.out.println("division mehtod");
	  
	 int  d = x/y;
	  return d;
  }
}
