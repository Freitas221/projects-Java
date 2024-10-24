package model.entities;

import model.exception.LimitException;

public class Account {

	private int number;
	private String name;
	private double saldo;
	private double saldoLimite;
	
	public Account() {
	}

	public Account(int number, String name, double saldo, double saldoLimite) {
		this.number = number;
		this.name = name;
		this.saldo = saldo;
		this.saldoLimite = saldoLimite;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}
	
	public void deposit(double quantia) {
		saldo += quantia;
	}
	
	public void saque ( double quantia) {
		validSaque(quantia);
		saldo -= quantia;
	}
	
	
	public void validSaque(double quantia){
		
		if(quantia > getSaldoLimite()) {
			throw new LimitException("O saque excede o limite de saque da conta.");
		}
		if(quantia > getSaldo()) {
			throw new LimitException("O saque excede o saldo da conta.");
		}
	}
}
