package OppConscept1;

public class MethodOverLoading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();		
		obj.sum(10);
		 obj.sum(10, 5);
		
	}

	
	public void sum() {
		System.out.println("sum method 0 parameter");
	}
	public void sum(int i) {
		System.out.println("sum method 1 input parameter");
		System.out.println(i);
	}
	public void sum(int j , int k) {
		System.out.println("sum method 2 input parameter");
		System.out.println(j+k);
	}
}
