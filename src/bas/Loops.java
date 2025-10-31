package bas;
// use to hide the loops logic
public class Loops{
	public Boolean CheckAcc(String accountNum) {
		while(true) {
			if (accountNum.length() != 3 && !accountNum.matches("\\d{3}")) {
				System.out.println("Please enter the correct number!");
				return true;
			} else {
				return false;
			}
		}
	}
	
	public Boolean tryAgain(int userInput) {
		if (userInput != 4) {
			return true;
		} else {
			return false;
		}
	}
}
