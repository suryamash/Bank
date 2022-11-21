package org.bank;

//single inheritance Q9
// class A

public class BankInfo extends AxisBank {
	
	private void saving() {
		System.out.println("saving");

	}
	
	private void fixed() {
		System.out.println("fixed");

	}
	
	public static void main(String[] args) {
		BankInfo a = new BankInfo();
		a.saving();
		a.fixed();
		a.deposit();
	}

}
