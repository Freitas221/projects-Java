package service;

public class BrazilTaxService implements InterestService {

	private double interestRate ;

	public BrazilTaxService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
