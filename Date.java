package exam3;
import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;

	}

	public void setMonth(int month) {
		while (month < 1 || month > 12) {
			System.out.println("Invaid Date ");
			System.out.println("please enter a valid Month");

		}
		this.month = month;
	}

	public void setDay(int day) {

		this.day = day;
	}

	public void setYear(int year) {
		while (year < 0) {
			System.out.println("Invaid Date ");
			System.out.println("please enter a valid year");

			// yell
		}
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	public static Date getDate() {
		Scanner input = new Scanner(System.in);
		Date result;
		int month;
		int day;
		int year;
		System.out.print("please enter a month: ");
		month = input.nextInt();
		System.out.print("please enter a day: ");
		day = input.nextInt();
		System.out.print("please enter a year: ");
		year = input.nextInt();
		result = new Date(month, day, year);
		return result;
	}

	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}
}
