package OppConscept1;

public class LocalVariable {

	String name = "kyle";
	int age = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable obj = new LocalVariable ();
		int number = 123;
		System.out.println(number);
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		
	}

	public void sum() {
		int i = 30;
		int j = 20;
		int k = i+j;
	
	}
}
