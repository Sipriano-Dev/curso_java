package entities;

import entities.exceptions.WithdrawExceptions;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	// Criando um metodo privado pra validar o valor, assim as outras classe nao tem
	// acesso a validaçao do withdraw, fica mais seguro
	public void withdraw(Double amount) throws WithdrawExceptions {
		validateWithdraw(amount);
		this.balance -= amount;
	}

	private void validateWithdraw(Double amount) throws WithdrawExceptions {
		if (amount > withdrawLimit) {
			throw new WithdrawExceptions("The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new WithdrawExceptions("Not enough balance");
		}
	}

}
