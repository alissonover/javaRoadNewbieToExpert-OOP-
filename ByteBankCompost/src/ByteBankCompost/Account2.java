package ByteBankCompost;

public class Account2 {
	private double balance;
	int agencyNumber;
	int accNumber;
	Client owner;

	public double deposit(double value) {
		return balance += value;
	}

	public boolean withdraw(double value) {
		if(this.balance > value) {
			this.balance -= value;
			return true;
		} 
		return false;
	}

	public boolean transfer(double value, Account2 destiny) {
		if(this.balance >= value) {
			this.balance -= value;
			destiny.deposit(value);
			return true;
		}
		return false;}
		
	 public double getBalance(){
		 return this.balance;
		
	}
	

	}


