package bas;
// use for the account (login thing)
public class Account {
	private String userName;
	private String accountNum;
	
	public void setUserName(String userName) {
	    this.userName = userName;
	}

	public void setAccountNum(String accountNum) {
	    this.accountNum = accountNum;
	}

	public String getUserName() {return userName;}
	public String getAccountNum() {return accountNum;}
}
