package exam3;
import java.util.Scanner;

public class Player {
	private Name name;
	private Date dob;
	private double balance;
	
	
	public Player(Name name, Date dob, double balance) {
		super();
		setName(name);
		setDob(dob);
		setBalance(balance);
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static Player createPlayer() {
		Scanner input = new Scanner(System.in);
		Player result;
		Name name = Name.getName();
		Date dob = Date.getDate();
		double balance;
		System.out.print("please enter player's balance: ");
		balance = input.nextDouble();
		result = new Player(name, dob, balance);
		return result;
	}

	@Override
	public String toString() {
		return "player's Name: " + name + "\nplayer's Birthday: "+dob+"\nplayer's balance: " + balance;
	}
} //end of class 
	