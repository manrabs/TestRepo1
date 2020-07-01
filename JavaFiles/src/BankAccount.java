public class BankAccount {

	private int accountNo;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNo;
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public BankAccount (int accountNo, double balance, String customerName, String email, long phoneNo){
		this.setAccountNo(accountNo);
		this.setBalance(balance);
		this.setCustomerName(customerName);
		this.setEmail(email);
		this.setPhoneNo(phoneNo);
	}
	
	public double deposit(int amount) {
		amount = Math.abs(amount);
		balance += amount;
		System.out.println("Deposit complete, your new balance is " + balance );
		return balance;
	}
	
	public double withdraw(int withdrawal) {
	
		if(withdrawal > balance) {
			System.out.println("Insufficient funds, withdrawal amount is more than current balance");
		}
		else {
			balance -= withdrawal;
			System.out.println("Hello " + customerName + ". Withdrawal complete your new balance is " + balance);
		}
		return balance;
	}
	
	public void accountInfo() {
		System.out.println("The following is your account information: ");
		System.out.print("Name: " + customerName);
		System.out.print("Account Number: " + accountNo);
		System.out.print("Balance: " + balance);
		System.out.print("Email: " + email);
		System.out.print("Phone Number : " + phoneNo);
	}
	
	
}
