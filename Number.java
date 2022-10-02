package MiniProject5;

public class Number {
	
	int number;
	int numberArray[];

	public Number(int[] getNumberArray, int getNumber) {
		numberArray = getNumberArray;
		number = getNumber;
	}
	
	protected int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}
	
	protected int[] getNumberArray() {
		return numberArray;
	}

	protected void setNumberArray(int[] numberArray) {
		this.numberArray = numberArray;
	}

	public void searchNumber() {
		
			for (int i = 0; i < numberArray.length; i++) {
			
			if(numberArray[i] == number) {
				System.out.println( number+ " found in Number Bag! "); 
				break;
			}
			else System.err.println("[ERROR] " + numberArray[i] + " and " + number + "are not same!! " +  
									number +  " was not found in Number Bag! ");
		}
	}
	

}
