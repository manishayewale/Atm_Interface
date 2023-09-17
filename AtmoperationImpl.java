package atm.com;

import java.util.HashMap;
import java.util.Map;

public class AtmoperationImpl implements AtmoperationInterf{
	Atminterface atm=new Atminterface();
	Map<Double,String>ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balnce is :"+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0) {
	    if(withdrawAmount<=atm.getBalance()) {
	    ministmt.put(withdrawAmount,"  Amount withdrawn");	
	    System.out.println("Collect the Cash  "+withdrawAmount);
	    atm.setBalance(atm.getBalance()-withdrawAmount);
	    viewBalance();
	    }
	    else {
	    	System.out.println("Insufficient Balnce !!");
	    }
	}
		else {
			System.out.println("Please enter amount in multiple of 500");
		}
			
		}

	@Override
	public void depositeAmount(double depositeAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositeAmount,"  Amount deposited");
		System.out.println(depositeAmount+"Deposite successfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
		
		
		
	}

	@Override
	public void viewMiniStatement() {
//	public void transactionHistory() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String>m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
