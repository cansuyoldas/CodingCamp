package Calculator;

public class Main {

	public static void main(String[] args) {
		//Week 2 / Video 30: Hesap makinası yapma
		Transactions t = new Transactions(10,2);
		t.result(t.doAddition());
		t.result(t.doDivision());
		t.result(t.doMultiplication());
		t.result(t.doSubtraction());
		
		//or
		
		int additionResult = t.doAddition();
		int divisionResult = t.doDivision();
		int multiplicationResult = t.doMultiplication();
		int subtractionResult = t.doSubtraction();
		
		System.out.println(" Addition Result is " + additionResult + System.lineSeparator() +
						   " Division Result is " + divisionResult + System.lineSeparator() +
						   " Multiplication Result is " + multiplicationResult + System.lineSeparator() +
						   " Subtraction Result is " + subtractionResult);
		
	}

}
