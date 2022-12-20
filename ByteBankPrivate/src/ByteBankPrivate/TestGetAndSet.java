package ByteBankPrivate;

public class TestGetAndSet {
 public static void main(String[] args) {
	Account2 acc1 = new Account2();
	
	acc1.setagencyNumber(1337);
	System.out.println("The number of acc1 is "+acc1.getagencyNumber());
	
	Client alisson = new Client();
	alisson.setName("alisson vasconcelos");
	
	acc1.setOwner(alisson);
	System.out.println(acc1.getOwner().getName());
	
	acc1.getOwner().setOcupation("Developer");
	System.out.println(acc1.getOwner().getOcupation());
}
}
