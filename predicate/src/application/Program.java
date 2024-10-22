package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
 // 4 - Predicate<Product> pred = p -> p.getPrice() >= 100;
 //list.removeIf(pred);
		
		list.add(new Product("TV", 900.00)); 
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100);
 // 1 - list.removeIf( new ProductPredicate());	
 // 2 - list.removeIf(Product :: staticProductPredicate);	
 // 3 - list.removeIf(Product :: nonstaticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		sc.close();
	}

}
