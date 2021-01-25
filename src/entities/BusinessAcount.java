package entities;

public class BusinessAcount extends Account {// é conta para empresa
	/*
	 BusinessAcount extends Account quer dizer que a conta da empresa vai herdar todos 
	 os atributos e métodos da conta comum
	 */
	
	private Double loanLimit; // loan (emprestimo)   loan limit = limite de emprestimo
	
	public BusinessAcount() {
		super();
	}
	
	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			deposit(amount);
		}
	}
	
}
