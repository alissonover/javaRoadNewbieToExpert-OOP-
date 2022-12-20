package ByteBankCompost;

public class TestBank {
	public static void main(String[] args) {
		
		//one method to create a Client
		Client Alisson = new Client();
		Alisson.name = "Alisson Felipe";
		Alisson.document = "123.456.789-10";
		Alisson.ocupation = "Developer";
		
		
		Account2 acc1 = new Account2();
		acc1.deposit(100);
		
		acc1.owner = Alisson;
		System.out.println(acc1.owner);
	}
}
