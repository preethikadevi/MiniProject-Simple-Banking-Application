package banking;

public class Account {

	private int acno;
	private static int sacno=500;//as static we can increment A/c no 
	private String name;
	private String city;
	private int balance;
    private String pin;
	// constructor
	public Account(String name, String city, int balance) {
		
		this.name = name;
		this.city = city;
		this.balance = balance;
	    this.acno=sacno++;
	  
	}
	//getter setter method to return values of variables and set parameters and assigns to name variables
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public static int getSacno() {
		return sacno;
	}
	public static void setSacno(int sacno) {
		Account.sacno = sacno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//to return provided information
	@Override
	public String toString() {
		return " [acno=" + acno + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}
	
	
	    
	}

