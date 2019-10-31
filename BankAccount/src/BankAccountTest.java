
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount("1234", 100.25, 44.20);
		BankAccount b = new BankAccount("5678", 200.44, 23.24);
		System.out.println(BankAccount.numberOfAccounts);
	}

}
