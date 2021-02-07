package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contr_Fisico;
import entities.Contr_Juridico;
import entities.Contribuinte;

public class Exercicio_Fixacao_Aula_134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		
		System.out.print("ENTER THE NUMBER OF TAX PLAYERS: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			System.out.print("Individual or Company (i / c): ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double renda = sc.nextDouble();
			
			if(c == 'i' || c == 'I') {
				System.out.print("Gastos com Saúde: ");
				Double gastoSaude = sc.nextDouble();
				
				list.add(new Contr_Fisico(name, renda, gastoSaude));
			}
			else {
				System.out.print("Quantidade de Funcionários: ");
				Integer quantFuncionarios = sc.nextInt();
				
				list.add(new Contr_Juridico(name, renda, quantFuncionarios));
			}			
		}
		
		System.out.println();
		System.out.println("<<TAXAS DE IMPOSTOS>>");
		
		double totalImpostos;
		totalImpostos = 0;
		for(Contribuinte contr : list) {
			
			System.out.print(contr.getNome() + " R$ " + String.format("%.2f", contr.valorImposto()) + "\n");
			totalImpostos = totalImpostos + contr.valorImposto();
		}
		
		System.out.println("");
		System.out.println("TOTAL IMPOSTOS: " + String.format("%.2f", totalImpostos));
		
		
		sc.close();
		
	}

}
