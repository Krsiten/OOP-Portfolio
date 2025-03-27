public class AccountStatus {
    public static void main(String[] args) {
		Account.createAccount("Kristen Holden", 20125421, 20000.00);
		Account.createAccount("Homer Simpson", 20145631, 200.00);
		Account.createAccount("John Doe", 65739284, 6421.50);
		 
		System.out.println(Account.accountList[0] + "\n\n");
		
		Account.accountList[0].deposit(200.00);
		
		System.out.println(Account.accountList[0] + "\n\n");
		
		Account.accountList[1].withdraw(250.00);
		
		System.out.println(Account.accountList[0] + "\n\n");
		
		Account.accountList[0].deposit(-20.00);
		
		System.out.println(Account.accountList[0] + "\n\n");
    }
}