package entities;

public class Contr_Fisico extends Contribuinte {

	//public Double valorRenda;
	public Double gastoSaude;
	
	public Contr_Fisico() {
		super();
	}
	

	public Contr_Fisico(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		//this.valorRenda = valorRenda;
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double valorImposto() {
		double imposto = 0;
		
		if(super.getRenda() >= 20000) {
			imposto = (getRenda() * 25 / 100) - (gastoSaude * 50 / 100);
		}
		else {
			imposto = (getRenda() * 15 / 100) - (gastoSaude * 50 / 100);
		}		
		return imposto;
	}
}
