class BankAccount
{
	private String accountNumber;
	private double balance;
	
	BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	
	void deposit(double amount)
	{
		
		balance += amount;
		
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance -= amount;
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	double getBalance()
	{
		return balance;
		
	}
}
	
class SavingAccount extends BankAccount
{
	SavingAccount(String accountNumber, double balance)
	{
		super(accountNumber,balance);
		
	}
	
	void withdraw(double amount)
	{
		if(getBalance()-amount<100)
		{
			System.out.println("Minimum Balance of $100 Required!");
			
		}
		else
		{
			super.withdraw(amount);
		}
	}
	
}
public class AccountBalance {
	public static void main(String[] args) {
		System.out.println("Create a Bank Account object (A/C no. BA1234) with initial balance of $500 :");
		BankAccount BA1234 = new BankAccount("BA1234", 500);
		System.out.println("Deposit $1000 into account BA1234");
		BA1234.deposit(1000);
		System.out.println("New balance after depositing $1000 : "+BA1234.getBalance());
		BA1234.withdraw(600);
		System.out.println("New balance after withdrawing $600 : "+BA1234.getBalance());
		
		System.out.println("create new Savingaccount object (A/C no. SA1234) with initial balance $450 : ");
		SavingAccount SA1234 = new SavingAccount("SA1234", 450);
		SA1234.withdraw(300);
		System.out.println("Balance after trying to withdraw $300 : "+SA1234.getBalance());
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300 :");
        SavingAccount SA1000 = new SavingAccount("SA1000", 300);
        
        
        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());      		
    }

	}


