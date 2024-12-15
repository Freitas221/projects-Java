package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		// 4 - Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		// list.forEach(cons);
		
		list.add(new Product("TV", 900.00)); 
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		// 1 - list.forEach(new PriceUpdate());
		// 2 - list.forEach(Product :: staticPriceUpdate);
		// 3 - list.forEach(noStaticUpdate);

		list.forEach(System.out::println);
		
		sc.close();
	}

}
