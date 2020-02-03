package com.class30;

public interface Bank {
	void haveChecking();
	void haveSaving();
	
}
interface Trustable{
	void trust();
}
class Finance{
	public void financing() {
		System.out.println("Final transactions must happen");
	}
}
class BOA extends Finance implements Bank,Trustable{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		System.out.println("BOA has a checking account");
	}

	@Override
	public void haveSaving() {
		// TODO Auto-generated method stub
		System.out.println("BOA has a saving account");
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("You can trust BOA with your money");
	}
	
}
class CapitalOne extends Finance implements Bank,Trustable{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		System.out.println("Capital One has checking account");
	}

	@Override
	public void haveSaving() {
		// TODO Auto-generated method stub
		System.out.println("Capital one has saving account");
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("You can trust Capital One with your money");
	}
	
}
class CapitalOneChild extends CapitalOne{
	
}