package classandobjects;

public class MyBankApp {
	

	public static void main(String[] args) {
		
		System.out.println("<<<-------------------------------------->>>");
		Account Acc = new Account(0, "Thamim", 0, null);
		
		Policy HDFC = new Policy(20, "lic", 100000, 10000, 100);
		
		Acc.addPolicy(HDFC);
		
		Acc.acc_Details();
		
		HDFC.showDetails();
		
		System.out.println("<<<-------------------------------->>>");
		Acc.getPolicyById(1);

	}
}