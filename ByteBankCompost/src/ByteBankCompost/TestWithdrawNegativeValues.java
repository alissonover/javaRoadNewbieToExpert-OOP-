package ByteBankCompost;

public class TestWithdrawNegativeValues {
	public static void main(String[] args) {
		Account2 acc3 = new Account2();
		
		//receiving boolean result
		acc3.deposit(50);
		acc3.withdraw(300);
		System.out.println(acc3.getBalance());
		
		//cheating the balance(before the encapsulation)
		//acc3.balance -= 101;
		//System.out.println(acc3.balance);
		
		
	}
}
