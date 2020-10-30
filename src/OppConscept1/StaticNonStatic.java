package OppConscept1;

public class StaticNonStatic {

	String name = "kyle";
	static int age = 10;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticNonStatic.sum();// by using class name 
		sum();// by calling method
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println(obj.name);// to call non static method we have to create an object and call from object.
		obj.sendmail();
		System.out.println(age);
		
	}
	public void sendmail() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}
}
