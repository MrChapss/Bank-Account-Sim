package bas;

public class Account {
	private String userName;
	private String accountNum;
	protected double balance;

	// userName, accountNUm, balance
	// setter can set condition
	public void setUserName(String userName) {
	    this.userName = userName;
	}

	public void setAccountNum(String accountNum) {
	    this.accountNum = accountNum;
	}

	public void setBalance(double balance) {
	    this.balance = balance;
	}

	public String getUserName() {return userName;}
	public String getAccountNum() {return accountNum;}
	public double getBalance() {return balance;}
}
