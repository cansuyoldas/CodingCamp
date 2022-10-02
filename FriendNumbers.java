package MiniProject4;

public class FriendNumbers {
	
	protected int numbA , numbB;
	int totalA = 0;
	int totalB = 0;
	
	public FriendNumbers() {
		
	}
	
	public FriendNumbers(int getNumbA, int getNumbB) {
		numbA = getNumbA;
		numbB = getNumbB;
	}

	protected int getNumbA() {
		return numbA;
	}

	protected void setNumbA(int numbA) {
		this.numbA = numbA;
	}

	protected int getNumbB() {
		return numbB;
	}

	protected void setNumbB(int numbB) {
		this.numbB = numbB;
	}
	
	public void checkFriendNumber(){
		
		for (int i = 1; i < numbA; i++) {
			if(numbA % i == 0) totalA += i ; }
		for (int i = 1; i < numbB; i++) {
			if(numbB % i == 0) {totalB += i;} }
		
		if(numbA == totalB && numbB == totalA) System.out.println( numbA + " and " + numbB + " are friend numbers!");
		else System.err.println( numbA + " and " + numbB + " are not friend numbers!");
		
	}
	

}
