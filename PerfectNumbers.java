package MiniProject3;

public class PerfectNumbers {
	
	protected int number;
	
	public PerfectNumbers() {
		
	}
	public PerfectNumbers(int getNumber) {
		number=getNumber;
	}

	protected int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}
	
	public void checkPerfectNumber() {
		
		int total=0;
		for (int i = 1; i < number; i++) {
			if(number % i ==0) total +=i;		
	}

		if(total==number) System.out.println("[INFO] '" + number + "' is Perfect Number!");
		else System.err.println("[ERROR] '" +number + " is not Perfect Number!" );
	}
}