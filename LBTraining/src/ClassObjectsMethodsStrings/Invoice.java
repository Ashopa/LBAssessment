package ClassObjectsMethodsStrings;

public class Invoice {
	
	String number; 
	String description; 
	int quantity;
	double price;
	double invoiceAmount;
	
	public Invoice(String number, String description, int quantity, double price) {
		setNumber(number);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);
		setInvoiceAmount(quantity,price);
	}	
	
	//Getter
	public String getNumber() {
		return number;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	
	//Setter
	public void setNumber(String number) {
		this.number = number;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=(quantity<0)?quantity:0;
	}
	
	public void setPrice(double price) {
		this.price = (price<0) ? price:0.0;
	}	
	
	public void setInvoiceAmount(int quantity,double price) {
		invoiceAmount = quantity * price;
	}
	
	public static void main(String[] args) {
    
		Invoice obj1 = new Invoice("A11","Screwdriver",10,100);
		Invoice obj2 = new Invoice("A12","Tester",10,17.6);
		Invoice obj3 = new Invoice("A13","Screw",30,2.5);
		System.out.println("Item Number - " + obj1.getNumber() + "\n" + "Item Name - " + obj1.getDescription() + "\n" + "Quantity - " + obj1.getQuantity() + "\n" + "Price per item - " + obj1.getPrice());
		System.out.println("Total Amount for the tool " + obj1.getDescription() + " - " + obj1.getInvoiceAmount());
		System.out.println("-------------------------------------------------------");
		System.out.println("Item Number - " + obj2.getNumber() + "\n" + "Item Name - " + obj2.getDescription() + "\n" + "Quantity - " + obj2.getQuantity() + "\n" + "Price per item - " + obj2.getPrice());
		System.out.println("Total Amount for the tool " + obj2.getDescription() + " - " + obj2.getInvoiceAmount());
		System.out.println("-------------------------------------------------------");
		System.out.println("Item Number - " + obj3.getNumber() + "\n" + "Item Name - " + obj3.getDescription() + "\n" + "Quantity - " + obj3.getQuantity() + "\n" + "Price per item - " + obj3.getPrice());
		System.out.println("Total Amount for the tool " + obj3.getDescription() + " - " + obj3.getInvoiceAmount());
	}

}
