package model.services;

public class TaxaServico {
	
	public double taxa(double amount) {
		
		if(amount <= 100) 
			return  amount * 0.2;
		else
			return amount * 0.15;
		
	}
}
	

