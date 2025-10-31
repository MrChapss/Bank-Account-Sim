package bas;
import java.util.Scanner;
// use to compute, get result, and store the amount
public class Computation{
	Scanner input = new Scanner(System.in);
	private double balance;
	private double userAmount;
	private int userChoice;
	
	// set the userChoice
	public void setUserChoice(int userChoice) {
		this.userChoice = userChoice;
	}
	// get the value of userChoice
	public int getUserChoice() {return userChoice;}
	
	// switch statement
	public int Result(int userChoice) {
		
		switch(userChoice) {
		case 1 -> System.out.println("Your balance is " + balance);
		case 2 -> { 
			System.out.print("Input the amout to deposit: ");
			userAmount = input.nextDouble();
			balance += userAmount;
		}
		case 3 -> {
			System.out.print("Input the amount to withdraw: ");
			userAmount = input.nextDouble();
			balance -= userAmount;
		}
		case 4 -> System.out.println("Exiting...");
		
		}
		return userChoice;
	}
}
