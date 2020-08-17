package exam3;
import java.util.*;
import java.io.*;

public class Name {
	private String firstName;
	private char middleInital;
	private String lastName;

	public Name(String firstName, char middleInital, String lastName) {
		setFirstName(firstName);
		setMiddleInital(middleInital);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		this.firstName = firstName;
	}

	public char getMiddleInital() {
		return middleInital;
	}

	public void setMiddleInital(char middleInital) {
		String nothing = "";
		nothing = nothing + middleInital;
		nothing = nothing.toUpperCase();
		middleInital = nothing.charAt(0);
		this.middleInital = middleInital;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		this.lastName = lastName;
	}

	public String toString() {
		String result;
		if (middleInital == ' ')
			result = firstName + " " + lastName;
		else
			result = firstName + " " + middleInital + ". " + lastName;
		return result;
	}

	public static Name getName() {
		Name result;
		String first, last;
		char middle = 'z';
		String tempMiddle;
		Scanner input = new Scanner(System.in);

		System.out.print("What is your first name.............: ");
		first = input.nextLine();

		System.out.print(first + ", what is your middle inital: ");
		tempMiddle = input.nextLine();
		if (tempMiddle.length() > 0)
			middle = tempMiddle.charAt(0);
		else
			middle = ' ';

		System.out.print(first + ", what is your last name....: ");
		last = input.nextLine();
		result = new Name(first, middle, last);
		return result;
	}

}