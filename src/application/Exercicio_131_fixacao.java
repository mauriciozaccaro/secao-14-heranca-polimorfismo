package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio_131_fixacao {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de Produtos: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("PRODUCT #" + i+1 + " DATA:");
			System.out.print("Comon, Used or Imported (c/u/i) ? ");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			
			if(x == 'i' || x == 'I') {
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
				
			}else if(x == 'u' || x == 'U') {
				System.out.print("Manufacture Date: ");
				Date manufactureDate = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, manufactureDate));
				
			}else {
				
				list.add(new Product(name, price));
			}
			
		}
			System.out.println();
			
			for(Product prod: list) {
				
				System.out.println(prod.priceEtiqueta());
			}
			
	}

}
