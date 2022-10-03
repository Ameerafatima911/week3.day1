package week3.day1;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("Saving from BankInfo");
	}
	
	public void fixed() {
		System.out.println("fixed from BankInfo");
	}
	
	@Override
	protected void deposit() {
		System.out.println("deposit from BankInfo");
	}
	public static void main(String[] args) {
		
		AxisBank objAB=new AxisBank();
		objAB.deposit();
		
		
		AxisBank objAB2=new BankInfo();
		objAB2.deposit();
	}
}
