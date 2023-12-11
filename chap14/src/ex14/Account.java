package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "¥" + balance + "(口座番号@" + accountNumber + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Account) {
			Account other = (Account) obj;
			String a1 = this.accountNumber.trim();
			String a2 = other.accountNumber.trim();
			if (a1.equals(a2)) {
				return true;
			}
		}
		return false;
	}
	
}
