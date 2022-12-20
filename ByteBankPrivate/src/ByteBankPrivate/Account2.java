package ByteBankPrivate;

public class Account2 {
	private double balance;
	private int agencyNumber;
	private int accNumber;
	private Client owner;

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
	 
	 public int getagencyNumber() {
		 return this.agencyNumber;
	 }
	 
	 public void setagencyNumber(int number) {
		 this.agencyNumber = number;
		 
	 }
	 
	 public int getAccNumber() {
		return this.accNumber;
	}
	 
	 public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	 
	 public void setOwner(Client owner) {
		this.owner = owner;
	}
	 
	 public Client getOwner() {
		return owner;
	}
	 
	 
	

	}


