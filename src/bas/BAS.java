package bas;
import java.util.Scanner;
// use for printing the codes
public class BAS {
	public static void main(String[] args) {
		// declare the scanner
		Scanner input = new Scanner(System.in);
		// create an object from its class
		Account bankAcc = new Account();
		Loops loop = new Loops();
		Computation logic = new Computation();
		
		// 1st. do while for login thing
		do {
			Dialouge.EnterName();
			bankAcc.setUserName(input.nextLine());
			
			Dialouge.EnterAccNum();
			bankAcc.setAccountNum(input.nextLine());
		// the while will check if account number is exact to rules
		} while(loop.CheckAcc(bankAcc.getAccountNum()));
		
		// 2nd. do while for switch
		do {
			// instructions
			Dialouge.IntroMessage();
			// user input
			logic.setUserChoice(input.nextInt());
			// result of user choice
			logic.Result(logic.getUserChoice());
		// repeat the whole code depends to user
		} while (loop.tryAgain(logic.getUserChoice()));
		
		input.close();
	}
}

