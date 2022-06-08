package moneyatreATM;

public class Accounts {
	 String Name;
	 double balance;
	 int password;
	
	public Accounts(String Name,int password, double balance) {
		this.Name=Name;
		this.balance=balance;
		this.password=password;
	}
	public double getBalance() {
		return  this.balance;
	}
	public String getName() {
		return this.Name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}

}
