package OppConscept1;

public class WrapperCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String i = "10";
	     System.out.println(Integer.parseInt(i));
	    int j =  Integer.parseInt(i);
	     System.out.println(j);
	     
	     String s = "10.20";
	    double d =  Double.parseDouble(s);
	    System.out.println(d+10);
	    
	    String k = "flase";
	    boolean b = Boolean.parseBoolean(k);
	    System.out.println(b);
	     	int m = 10;
	     	String s1 = String.valueOf(m); 
	     	System.out.println(s1+20);
	     	
	}

}
