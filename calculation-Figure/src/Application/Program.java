package Application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;
import entities.Shape;
import entities.circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		try {
			System.out.print("Entre com o número de figuras: ");
			int x = sc.nextInt();

			for (int i = 0; i < x; i++) {
				System.out.println();
				System.out.print("Retangulo ou circulo( r/c ):  ");
				sc.nextLine();
				char ch = sc.nextLine().charAt(0);
				System.out.println();
				
				if(ch != 'r' && ch != 'c') {
					System.out.println("Letra inválida, considerando RETANGLE.");
				}
				System.out.println();
				System.out.print("COLOR: BLACK, BLUE or RED: ");
				Color color = Color.valueOf(sc.next());
				if (ch == 'r') {
					System.out.print("Largura: ");
					double largura = sc.nextDouble();
					System.out.print("Altura: ");
					double altura = sc.nextDouble();
					Retangle retangle = new Retangle(color, largura, altura);
					list.add(retangle);
				} else {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					list.add(new circle(color, radius));

				}
				System.out.println();
				System.out.println("Area: ");

				for (Shape shape : list) {
					System.out.println(String.format("%.2f", shape.area()));
				}

			}
		} catch (InputMismatchException e) {
			System.out.println("Erro de input");
		}
		sc.close();
	}

}
