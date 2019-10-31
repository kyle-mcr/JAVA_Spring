
public class BankAccount {
	private Double accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	public static int numberOfAccounts = 0;
	public static int totalMoney = 0;
	public static Double  randomAccount = Math.random()*100 ;
	public BankAccount(String accountParam, Double checkingParam, Double savingsParam) {
		accountNumber = makeNumber();
		checkingBalance = checkingParam;
		savingsBalance = savingsParam;
		numberOfAccounts++;
		totalMoney += checkingBalance + savingsBalance;
	}
	private Double makeNumber() {
		Double x;
		x = (Double)(Math.random()*10);
		return x;
	}
	public Double checkBalance() {
		return checkingBalance;
	}
	public Double saveBalance() {
		return savingsBalance;
	}
	public void deposit(double num) {
		checkingBalance += num;
		totalMoney += num;
	}
	public void depositSave(double num) {
		savingsBalance += num;
		totalMoney += num;
	}
	public void withdrawl(double num) {
		savingsBalance -= num;
		totalMoney -= num;
	}
}
