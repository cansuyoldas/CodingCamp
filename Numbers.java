package MiniProject1;

public class Numbers {

	protected int number;
		
	public Numbers(int getNumber) { //must for Main class
		number=getNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void checkPrimeNumber() {

			int count = 0;
			
			for (int i = 2; i < number; i++) {
				if(number % i == 0) count++;
			}
			if(count==0) System.out.println(number + "Number is Prime Number!");
			else System.out.println("Number is not Prime Number!");
			
	}
	
	
}

