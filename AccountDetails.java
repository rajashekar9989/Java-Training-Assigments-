
package model;

public class AccountDetails {
// private User user;
	private String bankName;
	private String accountType;

	public AccountDetails(String bankName, String accountType) {
		super();
// this.user = user;
		this.bankName = bankName;
		this.accountType = accountType;
	}

//public User getUser() {
// return user;
//}
//public void setUser(User user) {
// this.user = user;
//}
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountDetails [ bankName=" + bankName + ", accountType=" + accountType + "]";
	}
}
