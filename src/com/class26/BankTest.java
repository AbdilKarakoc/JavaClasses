package com.class26;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.money=900;
		double fee=bank.chargeFee();
		System.out.println("Bank fee="+fee);
		
		PNC pnc =new PNC();
		pnc.money=900;
		double pncFee=pnc.chargeFee();
		System.out.println("PNC fee="+pncFee);
	}

}
