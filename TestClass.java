package exam3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		
		SlotMachine aaa = SlotMachine.makeMachine();
		System.out.println(aaa);
		
		/*
		// TODO Auto-generated method stub
			char choice;
			int machineCount = 0;
			//create three slot machines 
			SlotMachine[] machines = new SlotMachine[50];
			machines[0] = new SlotMachine();
			machines[0].setName("Lucky 7");
			machines[0].setNumJackpot(10000);
			machines[0].setJackpotPayOut(5000);
			machines[0].setNumRegWins(10);
			machines[0].setRegWinsPayOut(5);
			
			machines[1] = new SlotMachine();
			machines[1].setName("Lucky Lotto");
			machines[1].setNumJackpot(100000);
			machines[1].setJackpotPayOut(75000);
			machines[1].setNumRegWins(50);
			machines[1].setRegWinsPayOut(25);
			
			machines[2] = new SlotMachine();
			machines[2].setName("purple people Eater");
			machines[2].setNumJackpot(50);
			machines[2].setJackpotPayOut(40);
			machines[2].setNumRegWins(5);
			machines[2].setRegWinsPayOut(2);
			machineCount = 3;
			do {
				choice = getChoice();
				switch(choice) { 
				case 'A': // Add a player
					
					break;
				case 'B': // Add a slot machine
					 Scanner input = new Scanner(System.in);
					
				           System.out.println("how many slot machines do you want to add ?");
				          int n = input.nextInt();
				          //up to 47 slot machines
				          for(int i = 0; i < n; i++, machineCount++) {
				        	  if (machineCount >= machines.length)
				        		  break;
				        	  machines[machineCount] =  SlotMachine.makeMachine();
				        
				        	  }//end of for loop
					break;
				case 'C': // Add money to your account
					
					break;
				case 'D': //Play a round
					
					
				case 'Q': // Quit the program		
					System.out.println("Thanks, Have a nice day!");
					break;
				default:
					System.out.println("Invalid Selection");
					System.out.println("ERROR..............");
					break;
				}// end switch		
			}while(choice != 'Q');
*/
		}// end of main


public static char getChoice() {
	
	Scanner input = new Scanner(System.in);
	System.out.println( "A. Add a player");
	System.out.println( "B. Add a slot machine");
	System.out.println( "C. Add money to your account");
	System.out.println( "D. Play a round");
	System.out.println( "Q. Quit the program\n\n");
	System.out.println( "\tEnter selection");
	char result = input.next().charAt(0);

	return result;

} // end getChoice

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	