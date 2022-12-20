package ByteBank;

public class testMethod {
	public static void main(String[] args) {
		Account acc1 = new Account();
		
		acc1.deposit(300);
		acc1.deposit(75);
		System.out.println(acc1.balance);
		
		Account acc2 = new Account();
		
		acc2.deposit(275);
		acc2.deposit(85);
		System.out.println(acc2.balance);
		
		acc2.withdraw(500);
		System.out.println(acc2.balance);
		
		acc2.transfer(50, acc1);
		System.out.println(acc1.balance);
		
		acc1.owner = "Alisson Felipe";
		System.out.println(acc1.owner);
	}
}
