package week3Day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Axis bank's deposit account");
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.deposit();
		ab.fixed();
	}

}
