import java.util.Date;

/*
 *  OOP Review Page 447 #11.3
 * NatS
 * version 1.0
 * OOP uses Account page 363 #9.7 
 */


public class Account{

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0; //assume all accounts have same interest rate
	private Date dateCreated; //uses class Date
	

	public Account(int id, double balance, Date dateCreated) { //Constructor
		super();
		this.id = id;
		this.balance = balance;
		this.dateCreated = dateCreated;
	}
	
	
	
	//Getters and Setters
	public Date getDateCreated() { 
		return dateCreated;
	}

	public Account(Date dateCreated) {
		super();
		this.dateCreated = dateCreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	
	
	//date creation
	public void setDateCreated(Date dateCreated) {	
		//return monthly interest rate -not interest rate
		this.dateCreated = dateCreated;
	}

	//returns annual interest rate
	public double getMonthlyInterestRate() {
		return balance * (annualInterestRate/1200); //percent use
	}

	//allows user to withdraw money
	public void withdraw(double someAmount) {
		balance -= someAmount;
	}

	//allows user to deposit money
public void deposit(double someAmount) {	
	balance += someAmount; 
	}

	

static void main(String[] args) {
	//TODO Auto-generate method stub
}

}
