package ByteBank;
public class Account {
	double balance;
	int agencyNumber;
	int accNumber;
	String owner;
	
	public double deposit(double value) {
		return balance += value;
		}
	public boolean withdraw(double value) {
		if(this.balance < value) {
			this.balance -= value;
			return true;
		}else
			return false;
		}
	public boolean transfer(double value, Account destiny) {
		if(this.balance >= value) {
			this.balance -= value;
			destiny.deposit(value);
			return true;
		}
		return false;
		
		}
	
	
	
	
	
}
