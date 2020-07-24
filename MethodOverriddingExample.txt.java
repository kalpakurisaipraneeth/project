

abstract class BankAccount {
	void dispaly()
	{
		System.out.println("Bank ");
	}
	
	abstract void openAccount();

	abstract void closeAccount();
}

abstract class BankTransaction extends BankAccount {

	abstract void deposit();

	abstract void withdraw();

	abstract void balance();

}

class SavingAccount extends BankTransaction {

	@Override
	void deposit() {
		System.out.println("Deposit in your Saving Account.");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from your Saving Account.");
	}

	@Override
	void balance() {
		System.out.println("Withdraw from your Saving Account.");
	}

	void calculateMonthlyAverage() {
		System.out.println("Average Initial Balance in Saving Account.");
	}

	@Override
	void openAccount() {
		System.out.println("Open Saving Account.");
		
	}

	@Override
	void closeAccount() {
		System.out.println("Close Saving Account.");
		
	}

}

class CurrentAccount extends BankTransaction {

	@Override
	void deposit() {
		System.out.println("Deposit in Current Account.");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from Current Account.");
	}

	@Override
	void balance() {
		System.out.println("Balance in Current Account.");
	}

	@Override
	void openAccount() {
		System.out.println("Open Current Account.");
		
	}

	@Override
	void closeAccount() {
		System.out.println("Close Current Account.");
		
	}

}

public class MethodOverriddingExample {

	public static void main(String[] args) {

		SavingAccount saving = new SavingAccount();
		saving.dispaly();
		saving.openAccount();
		saving.deposit();
		saving.withdraw();
		saving.balance();
		saving.closeAccount();
	

		CurrentAccount current = new CurrentAccount();
		current.openAccount();
		current.deposit();
		current.withdraw();
		current.balance();
		current.closeAccount();
	
	}

}