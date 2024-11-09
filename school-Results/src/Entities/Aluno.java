package Entities;

public class Aluno {
	
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	public double soma;
	
	
	public void somaTrimestre() {
		 soma = trimestre1 + trimestre2 + trimestre3;
		
	}
	
	public void resultadoFinal() {
		if (soma < 60.0) {
			soma = 60.0 - soma;
			System.out.printf("Reprovado \nFalta %.2f pontos para 60.0", soma);
		}else {
			System.out.printf("FINAL GRADE: %.2f \nAprovado", soma);
			
		}
		
	}
	
	
	
	
	
	

}
