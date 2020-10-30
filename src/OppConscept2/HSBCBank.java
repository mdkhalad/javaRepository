package OppConscept2;

public class HSBCBank implements USBank,BarzilBank  {

	
	  public void credit() {
		  System.out.println("hsbc ============credit");
	  }
	  public void debit() {
		  System.out.println("hsbc==========debit");
	  }
	
	  public void transferMoney() {
		  System.out.println("hsbc===============transferMoney");
	  }
	  public void eaducationLoan() {
		  System.out.println("hsbc === eadu== loan");
	  }
	  
	  public void carloan() {
		  System.out.println("hsbc ===============carloan");
	  }
	  
	  public void MitualFund() {
		  System.out.println("hsbc=============== mitualFund");
	  }
}

