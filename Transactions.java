package Calculator;

public class Transactions extends Calculator{
			
	public Transactions(int getNumbA, int getNumbB) {
		super(getNumbA,getNumbB);
	}
	
	public int doMultiplication() {
		return getNumbA() * getNumbB();
	}
	
	public int doDivision() {
		return getNumbA() / getNumbB();
	}
	
	public int doSubtraction() {
		return getNumbA() - getNumbB() ;
	}
	
	public int doAddition() {
		return getNumbA() + getNumbB();
	}
	
	public void result(int result) {
		System.out.println("Result is " + result);
	}
}
