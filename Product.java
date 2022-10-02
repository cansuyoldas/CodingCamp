package ProductManagement;

public class Product {

	String name, description, color;
	int ID, stockAmount;
	double price;
	String code ="0007JAMESBOND";
	
	public Product(String name,String description, String color, int ID,int stockAmount, double price) {
		this.name=name;
		this.description=description;
		this.color = color;
		this.ID=ID;
		this.stockAmount=stockAmount;
		this.price=price;
	}
	
	public Product() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCode() {  // User can not write and can read.
		return code.substring(0,4) + ID;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
}
