package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Exercicio_130_Funcionarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> func = new ArrayList<>();
		//List<Employee> terc = new ArrayList<>();
		
		
		System.out.print("Digite a quantidade de Funcionários que deseja cadastrar: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			System.out.print("Funcionário Terceirizado? (s/n): ");
			char x = sc.next().charAt(0); // preciso trocar para tipo CharAt quando lembrar como faz
			
			System.out.println("EMPLOYEE #" + i+1 + " DATA: ");
			if(x == 's' || x == 'S') {// se ele for terceirizado
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				
				
				func.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			}else {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				
				func.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("<<FUNCIONARIOS>>");
		System.out.println(func);
		
		
		sc.close();
	}

}
