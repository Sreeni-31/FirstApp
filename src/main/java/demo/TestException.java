package demo;

public class TestException {
	double balance = 99.00;
	
	public void balanceCheck(){
	if (balance < 100.00) 
	try {
		
		 throw new CustomeException("Insufficient amount to withdraw. balance while withdraw:" + balance +"$");
	}catch(CustomeException ce) {
		System.out.println("Caught the exception");
		System.out.println(ce.getMessage());
		
	}
	System.out.println("executing remaining code");
	}
	
public static void main(String[] args) {
	TestException te = new TestException();
	te.balanceCheck();
}

}
