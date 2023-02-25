package bankaccount;

public class SuperBank extends Bank {
	
	private String address;
	
	public SuperBank(String name, int idNo,double balance,String address) {
		super(name,idNo,balance);
		this.address = address;
	}
	public void SetAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public String toString() {
		return "SuperBank[Name = " + getName() + " Id No =  " +getId() + " Balance = "+getBalance() + " Address = "+address +"]";
	}

}
