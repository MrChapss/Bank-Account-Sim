package bas;
import java.util.Scanner;

public class BAS {
	public static void main(String[] args) {
		// declare the scanner
		Scanner input = new Scanner(System.in);
		// create an object from its class
		Account bankAcc = new Account();
		Loops loop = new Loops();
		Computation logic = new Computation();
		
		// login (just for show)
		do {
			Dialouge.EnterName();
			bankAcc.setUserName(input.nextLine());
			
			Dialouge.EnterAccNum();
			bankAcc.setAccountNum(input.nextLine());
		} while(loop.CheckAcc(bankAcc.getAccountNum()));
		
		do {
			//switch
			Dialouge.IntroMessage();
			logic.setUserChoice(input.nextInt());
			
			logic.Result(logic.getUserChoice());
		
		} while (loop.tryAgain(logic.getUserChoice()));
		
		
		
		//System.out.printf("%nHello %s!", bankAcc.getUserName());
		
		//input.close();
	}
}

