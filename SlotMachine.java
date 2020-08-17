package exam3;

import javax.swing.JOptionPane;

public class SlotMachine {
	private String name;
	private double slotBalance;
	private int numJackpot;
	private double jackpotPayOut;
	private int numRegWins;
	private double RegWinsPayOut;
	
	public SlotMachine(String name, double slotBalance, int numJackpot, double jackpotPayOut, int numRegWins,
			double regWinsPayOut) {
		super();
		this.name = name;
		this.slotBalance = slotBalance;
		this.numJackpot = numJackpot;
		this.jackpotPayOut = jackpotPayOut;
		this.numRegWins = numRegWins;
		RegWinsPayOut = regWinsPayOut;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSlotBalance() {
		return slotBalance;
	}
	public void setSlotBalance(double slotBalance) {
		//Player needs at least 1 dollar to play
		if (slotBalance > 0)
		this.slotBalance = slotBalance;
	}
	public int getNumJackpot() {
		return numJackpot;
	}
	public void setNumJackpot(int numJackpot) {
		this.numJackpot = numJackpot;
	}
	public double getJackpotPayOut() {
		return jackpotPayOut;
	}
	public void setJackpotPayOut(double jackpotPayOut) {
		this.jackpotPayOut = jackpotPayOut;
	}
	public int getNumRegWins() {
		return numRegWins;
	}
	public void setNumRegWins(int numRegWins) {
		this.numRegWins = numRegWins;
	}
	public double getRegWinsPayOut() {
		return RegWinsPayOut;
	}
	public void setRegWinsPayOut(double regWinsPayOut) {
		RegWinsPayOut = regWinsPayOut;
	}
	@Override
	public String toString() {
		return "SlotMachine [name=" + name + ", slotBalance=" + slotBalance + ", numJackpot=" + numJackpot
				+ ", jackpotPayOut=" + jackpotPayOut + ", numRegWins=" + numRegWins + ", RegWinsPayOut=" + RegWinsPayOut
				+ "]";
	}
	
	public static SlotMachine makeMachine() {
		SlotMachine result;
		
		String name;
		 double slotBalance = 0;
		 int numJackpot;
		 double jackpotPayOut;
		 int numRegWins;
		 double regWinsPayOut;
		 
		 name = JOptionPane.showInputDialog("What is the name of the slot machine?");
		 numJackpot = Integer.parseInt(JOptionPane.showInputDialog("how many plays before jackpot?"));
		 jackpotPayOut = Double.parseDouble(JOptionPane.showInputDialog("how much does the jackpot pays?"));
		 numRegWins = Integer.parseInt(JOptionPane.showInputDialog("how many plays before regular win?"));
		 regWinsPayOut= Double.parseDouble(JOptionPane.showInputDialog("how much does a regular win pays?"));
		 result = new SlotMachine( name,  slotBalance,  numJackpot,  jackpotPayOut,  numRegWins,
					 regWinsPayOut);
		return result;
	}// end make machine

	}
	

