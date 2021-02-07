package entities;

public class Contr_Juridico extends Contribuinte {

	private Integer numeroFuncionarios;
	
	public Contr_Juridico() {
		super();
	}

	public Contr_Juridico(String nome, Double renda, Integer numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public double valorImposto() {
		double imposto = 0;
		
		if(numeroFuncionarios > 10) {
			imposto = getRenda() * 0.14;
		}
		else {
			imposto = getRenda() * 0.16; // 0,1 é igual a 16% ou getRenda() * 16 /100
		}		
		return imposto;
	}
	
	
}
