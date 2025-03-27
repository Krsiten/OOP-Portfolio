class Account {
	public static Account[] accountList = new Account[30];
    private static double interestRate = 0.03;
    private static int totalAccounts = 0;
    private String name;
    private int accountNumber;
    private double balance;
    
     
    public Account(String customerName, int accNum, double amount)
    {
    	
    	name = customerName;
    	accountNumber = accNum;
    	balance = amount;
    }
    
    public static void createAccount(String customerName, int accNum, double amount)
    {
    	if (totalAccounts >= 30)
    	{
    		System.out.println("Your account cannot be created. L&L Bank is not currently accepting any new customers.");
    	}
    	else
    	{
    		accountList[totalAccounts++] = new Account(customerName, accNum, amount);
    	}
    }
    
    public void deposit(double amount)
    {
    	if (amount < 0)
    	{
    		System.out.println("You cannot deposit a negative ammount. Please deposite a positive ammount");
    	} 
    	else
    	{
    		System.out.println(amount + " has been successfully added to your account" + "\n\n" 
    				+ "Your previous balance was: " + balance + ".\n"
    				+ "Your current balance is: " + (balance + amount) + ".");
    		balance += amount;
    	}
    }
    	
    public void withdraw(double amount)
    {
    	if (amount < 0)
    	{
    		System.out.println("You cannot withdraw a negative ammount. Please withdraw a positive amount");
    	}
    	else if (balance < amount )
    	{
    		System.out.println("You cannot make a withdraw money due to insufficient funds.");
    	}
    	else
    	{
    		System.out.println(amount + "has been successfully withdrawn from your account" + "\n\n" 
    				+ "Your previous balance was: " + balance + ".\n"
    				+ "Your current balance is: " + (balance - amount) + ".");
    		balance -=amount;
    	}
    }
    
    public void interest()
    {
    	for (int m = 0; m < totalAccounts; m++)
    	{
    		System.out.println("Interest of " + (accountList[m].balance * interestRate) + "has been added to all accounts.");
    		accountList[m].balance += accountList[m].balance * interestRate;
    	}
    	
    }
    
    public double getBalance()
    {
    	return balance;
    }
    
    public String toString()
    {
    	String status = ("\n--Accounts--\n" );
    	for (int m = 0; m < totalAccounts; m++)
    	{
    		status += ("Name:		" + accountList[m].name + "\n"
    				+ "Account Number:		" + accountList[m].accountNumber + "\n"
    				+ "Balance:		" + accountList[m].balance + "\n"
    				+ "-------------------------------\n");
    	}
    	return status;
    }
}

