package MiniProject3;

public class Main {

	public static void main(String[] args) {
		// Video 21: Mükemmel sayı 
		PerfectNumbersUtility ut = new PerfectNumbersUtility(28);
		ut.checkPerfectNumber();
		
		ut.setNumber(6);
		ut.checkPerfectNumber();
		
		ut.setNumber(7);
		ut.checkPerfectNumber();

	}

}
