package lab3;

public class Account extends Person {
	static int totalAccounts;
	int acNo;
	double balance = 0;
	int numberOfTransaction = 0;
	int totalNumberOfTransaction = 4;
	Account(String name, int accNo, int balance) {
		super(name);
		this.acNo = accNo;
		deposit(balance);
		totalAccounts++;
		System.out.println(this);
	}

	Account(String name, int accNo, String address, int balance) {
		super(name, address);
		this.acNo = accNo;
		deposit(balance);
		totalAccounts++;
		System.out.println(this);

	}

	@Override
	public String toString() {

		return "Account created for " + this.name + " with " + this.balance + " initial balance";
	}

	static int getNumberOfAccount() {
		return totalAccounts;
	}

	void deposit(int amount) {
		balance += amount;
		numberOfTransaction++;
	}

	void deposit(long amount) {
		balance += amount;
		numberOfTransaction++;
	}

	void deposit(float amount) {
		balance += amount;
		numberOfTransaction++;
	}

	void deposit(double amount) {
		balance += amount;
		numberOfTransaction++;
	}

	void withdraw(int money) throws InvalidBalanceException {
		// if balance is less 500 then throw InvalidBalanceException
		if (balance < 500) {
			throwException();
		} else {
			balance -= money;
			numberOfTransaction++;
		}
	}

	void withdraw(long money) throws InvalidBalanceException {
		// if balance is less 500 then throw InvalidBalanceException
		if (balance < 500) {
			throwException();
		} else {
			balance -= money;
			numberOfTransaction++;
		}
	}

	void withdraw(float money) throws InvalidBalanceException {
		// if balance is less 500 then throw InvalidBalanceException
		if (balance < 500) {
			throwException();
		} else {
			balance -= money;
			numberOfTransaction++;
		}
	}

	void withdraw(double money) throws InvalidBalanceException {
		// if balance is less 500 then throw InvalidBalanceException
		if (balance < 500) {
			throwException();
		} else {
			balance -= money;
			numberOfTransaction++;
		}
	}

	void throwException() throws InvalidBalanceException {

		
			throw new InvalidBalanceException();
	
	}

	double getBalance() {
		return balance;
	}

	int numberOfTransaction() {
		return numberOfTransaction;
	}

	public static void main(String args[]) throws InvalidBalanceException {
		Account p1 = new Account("Mark", 25, "Bng", 1000);
		Account p2 = new Account("Dark", 75, 500);
		System.out.println(Account.getNumberOfAccount() + " accounts has already been created.");
		p1.deposit(1200.50f);
		p2.deposit(100);
		p2.withdraw(600);
		
		// here is a problem of output
		System.out.println(p1.name + " has made " + p1.numberOfTransaction + " transactions out of "
				+ p1.totalNumberOfTransaction + "transactions");

		p2.withdraw(100);
		
	}
	

	private static class InvalidBalanceException extends Exception{
		
		@Override
		public String toString() {
			
			return super.toString();
		}
	}
	
}

// Account created for Mark with 1000 initial balance
// Account created for Dark with 500 initial balance
// 2 accounts have already been created.
// Mark has made 2 transactions out of 4 transactions
// An exception will occur here.
