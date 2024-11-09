package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Produto>list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.print("Insira o número de produtos: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Produto comum, usado ou importado (c / u / i) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço do produto: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {

				list.add(new Produto(name, price));
			}
			else if(ch == 'u') {
				System.out.print("Digite a data de fabricação do produto: dd/MM/yyyy");
				Date date = sdf.parse(sc.next());
				list.add(new ProdutoUsado(name, price, date));	
			}
			else {
				
				System.out.println("Taxa de importação: ");
				double custoDeImportacao = sc.nextDouble();
				list.add(new ProdutoImportado(name, price, custoDeImportacao));
				
				
			}
			
		}
		
		for(Produto pro : list) {
			System.out.println(pro.toString());
		}
		
		
		
		
		sc.close();
	}

}
