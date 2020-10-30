package AbstractConcept;

public class test implements manual,automation{

	@Override
	public void testscript() {
		// TODO Auto-generated method stub
		System.out.println("testscript");
	}

	@Override
	public void testreport() {
		// TODO Auto-generated method stub
		System.out.println("testreport");
	}

	@Override
	public void requrements() {
		// TODO Auto-generated method stub
		System.out.println("requirements");
	}

	@Override
	public void testcases() {
		// TODO Auto-generated method stub
	System.out.println("testcases");	
	}
    
	public void logdefect() {
		System.out.println("defect");
	}
	
	
}
