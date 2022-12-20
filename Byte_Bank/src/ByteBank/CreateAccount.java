package ByteBank;
public class CreateAccount {
	public static void main(String[] args) {
		Account firstAcc = new Account();
		firstAcc.balance = 200;
		System.out.println("The first account has U$" + firstAcc.balance);
		
		firstAcc.balance += 100;
		System.out.println("The first account have U$" + firstAcc.balance);		
		
		Account secondAcc = new Account();
		secondAcc.balance = 50;
		System.out.println("The second account have U$" + secondAcc.balance);
	
		firstAcc.owner = "Alisson Felipe";
		System.out.println(firstAcc.owner);
	
	
	}
}
