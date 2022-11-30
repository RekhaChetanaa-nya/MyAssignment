package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Axis Bank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}

}
