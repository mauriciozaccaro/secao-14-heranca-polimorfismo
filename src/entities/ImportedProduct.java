package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		Double totalPrice = super.getPrice() + customsFee;
		return totalPrice;
	}
	
	@Override
	public String priceEtiqueta() {
		return super.getName() + " R$ " + String.format("%.2f", totalPrice()) 
				+ " (Customs Fee: R$ "
				+ String.format("%.2f", customsFee) +") ";
	}
	
}
