package ProductManagement;

public class Main {

	public static void main(String[] args) {
		// Week 2 / Video 31: Product Management
		Product product = new Product();
		product.setID(1);
		product.setName("Coffee Machine VBond0007");
		product.setDescription("James Bond Special Production ");
		product.setPrice(1999.9);
		product.setStockAmount(1000);
		
		Product[] productArray = new Product[1];
		productArray[0] = product;
		System.out.println("Product Details : " );

		for (Product product2 : productArray) {
			System.out.println(" Product ID           : " + product2.getID());
			System.out.println(" Product Name         : " + product2.getName());
			System.out.println(" Product Description  : " + product2.getDescription());
			System.out.println(" Product Stock Amount : " + product2.getStockAmount());
			System.out.println(" Product Price        : " + product2.getPrice());
		}
		
		// Week 2 / Video 33 : Product Management Continues...
		product.setColor("RED7DEUPO");
		System.out.println(System.lineSeparator() +
						   " Product Color is " + product.getColor() + System.lineSeparator() + 
						   " Product Code is " + product.getCode());
		
	}
}
