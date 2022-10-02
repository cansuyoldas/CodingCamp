package MiniProject5;

public class Main {

	public static void main(String[] args) {
		// Video 23 : Verilen sayının, sayı dizisinde aranması
		int[] numberArray1 = {2,3,4,5,6,7,8};
		int searchedNumber =5;
		NumberBag nb = new NumberBag(numberArray1, searchedNumber);
		nb.searchNumber();
		
		searchedNumber =1;
		nb.setNumber(searchedNumber);
		nb.searchNumber();
		
		int[] numberArray2  = {1,3,5,7,9};
		nb.setNumberArray(numberArray2);
		nb.searchNumber();
		
		searchedNumber =2;
		nb.setNumber(searchedNumber);
		nb.searchNumber();
	}

}
