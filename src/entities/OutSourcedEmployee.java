package entities;

public class OutSourcedEmployee extends Employee{ // funcionario terceirizado

	private Double additionalCharge;
	
	public OutSourcedEmployee() {
		
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	 
	@Override
	public double payment() {
		return  hours * valuePerHour + additionalCharge*1.1;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	public String toString() {
		return getName() + " - R$ " + payment() + "\n";
	}
	
	
}
