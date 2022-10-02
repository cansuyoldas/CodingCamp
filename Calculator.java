package Calculator;

public class Calculator {
	
	protected int numbA, numbB;
	
	public Calculator(int numbA, int numbB) {
		super();
		this.numbA = numbA;
		this.numbB = numbB;
	}

	public int getNumbA() {
		return numbA;
	}

	public void setNumbA(int numbA) {
		this.numbA = numbA;
	}

	public int getNumbB() {
		return numbB;
	}

	public void setNumbB(int numbB) {
		this.numbB = numbB;
	}
}
