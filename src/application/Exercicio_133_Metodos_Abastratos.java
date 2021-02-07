package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shapes;
import entities.enums.Color;

public class Exercicio_133_Metodos_Abastratos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shapes> shp = new ArrayList<>();
		
		
			System.out.print("ENTER DE NUMBER OF SHAPES:");
			int N = sc.nextInt();
			
			for(int i = 0; i < N; i++) {
				
				System.out.println("Shape #" + (i+1) + " data: ");
				System.out.print("Rectangle or Cicle (r / c): ");
				char x = sc.next().charAt(0);
				sc.nextLine();
				System.out.print("Color (BLACK, BLUE, RED): ");
				String color = sc.nextLine();
				/* desse "Color()" que é um ENUM dava pra fazer direto.. colocando..
				 * Color color = Color.valueOf(sc.next());
				 * aí ali em baixo quando eu instancio o objeto Rectangle() ou Circle()
				 * é só chamar a variavel "color"
				 * */
				
				if(x == 'r' || x == 'R') {
					
					System.out.print("Width: ");
					Double width = sc.nextDouble();
					System.out.print("Heigth: ");
					Double heigth = sc.nextDouble();
					
					shp.add(new Rectangle(Color.valueOf(color), width, heigth));										
				}else {
					
					System.out.print("Radius: ");
					Double radius = sc.nextDouble();
					
					shp.add(new Circle(Color.valueOf(color), radius));					
				}
				
			}
		
			System.out.println("<<SHAPES AREAS>>");
			
			for(Shapes x : shp) {
				
				System.out.printf("A Area do Shape é: %.2f \n", x.area());
			}
			
		sc.close();
		
	}

}
