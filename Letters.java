package MiniProject2;

public class Letters extends BoldThinVowels{
	
	protected String letter;

	public Letters() {
		
	}
	public Letters(String newLetter) {
		letter = newLetter;
	}
	public Letters(String[] boldVowelsArray, String[] thinVowelsArray) {
		super(boldVowelsArray,thinVowelsArray);
	}
	
	protected String getLetter() {
		return letter;
	}
	protected void setLetter(String letter) {
		this.letter = letter;
	}
	
	
	public void checkLetter() {
		
		for (int i = 0; i < 1; i++) {
			
			if(letter == boldVowelsArray[i]) {
				System.out.println("[INFO] '" + letter + "' is bold vowels!");
			}
			else if(letter == thinVowelsArray[i])  System.out.println("[INFO] '" + letter + "' is thin vowels!");
			else System.err.println("[ERROR] '" + letter + "' is not bold vowels or thin vowels!");
		}
		
	}
	
	
}

