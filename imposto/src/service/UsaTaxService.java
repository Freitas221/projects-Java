package service;

public class UsaTaxService implements InterestService {

	private double interestRate ;

	public UsaTaxService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
