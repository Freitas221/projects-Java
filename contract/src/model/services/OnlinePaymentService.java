package model.services;

public interface OnlinePaymentService {
	
	double paymentFre(double amount);
	double interest(double amount, Integer months );
}
