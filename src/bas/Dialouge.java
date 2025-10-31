package bas;
// used for instructions and yapping session
public class Dialouge {
	public static void EnterName() {
		System.out.print("Enter your account name: ");
	}
	
	public static void EnterAccNum() {
		System.out.print("Enter your account number: ");
	}
	
	public static void IntroMessage() {
		System.out.printf("%nWelcome to Bank Simulator!%n");
		
		System.out.println("1.) Check Balance");
		System.out.println("2.) Deposit");
		System.out.println("3.) Withdraw ");
		System.out.println("4.) Exit");
	
		System.out.print("Please choose from (1-4): ");
	}
}
