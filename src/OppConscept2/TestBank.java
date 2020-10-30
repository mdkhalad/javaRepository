package OppConscept2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.eaducationLoan();
		hs.transferMoney();
		hs.carloan();
		
		
		USBank b  =  new HSBCBank();
		     b.credit();
		     b.debit();
		     b.transferMoney();
		
		
	}

}
