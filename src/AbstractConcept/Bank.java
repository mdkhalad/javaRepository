package AbstractConcept;

public  abstract class Bank {

	public abstract void loan();
	
	public void credit() {
		System.out.println("credit =============== bank");
	}
	public void debit() {
		System.out.println("debit============== bank");
	}
	
}
