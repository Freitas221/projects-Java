package Application;

import java.util.Locale;
import java.util.Scanner; 
import service.BrazilTaxService;
import service.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Juros: ");
		double juros = sc.nextDouble();
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		
		InterestService is = new BrazilTaxService(2.0);
		
		double payment = is.payment(juros, meses);
		
		System.out.println("Pagamento depois de " + meses + "meses: ");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();

	}

}
