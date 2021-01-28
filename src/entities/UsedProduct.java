package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	private Date manufactureDate; //= sdf.parse("15/01/2020");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceEtiqueta() {
		
		return super.getName() + " (used) " + "R$ " + String.format("%.2f", super.getPrice())
		+ " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	
	
}
