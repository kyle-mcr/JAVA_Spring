
public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	public static int numberOfAccounts = 0;
	public static int totalMoney = 0;
	public BankAccount(String accountParam, Double checkingParam, Double savingsParam) {
		accountNumber = accountParam;
		checkingBalance = checkingParam;
		savingsBalance = savingsParam;
		numberOfAccounts++;
		totalMoney += checkingBalance + savingsBalance;
	}
	
	
}
