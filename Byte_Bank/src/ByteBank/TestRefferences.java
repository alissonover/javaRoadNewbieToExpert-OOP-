package ByteBank;

public class TestRefferences {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		
		System.out.println("1st balance account " + firstAccount.balance);
		
		Account secondAccount = firstAccount;
		
		//secondAccount gain the same ref by firstAccount
		secondAccount.balance += 100;
		
		System.out.println(firstAccount.balance);
		System.out.println(secondAccount.balance);
	
	}
}
