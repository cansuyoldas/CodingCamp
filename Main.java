package CreditManagement;

public class Main {

	public static void main(String[] args) {
		// Week 2 / Video 37 : Credit management
		CreditUI ui = new CreditUI();
		ui.creditCalculate(new TeacherCreditManager());

	}

}
