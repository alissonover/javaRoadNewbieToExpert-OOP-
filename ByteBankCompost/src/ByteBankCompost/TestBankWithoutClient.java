package ByteBankCompost;

public class TestBankWithoutClient {
	public static void main(String[] args) {
		
		Account2 acc2 = new Account2();
		System.out.println(acc2.getBalance());
		
		//other method to create a Client
		acc2.owner = new Client();
		System.out.println(acc2.owner);
		
		//way to give a name to owner
		acc2.owner.name = "Alisson";
		System.out.println(acc2.owner.name);
		
	}
}
