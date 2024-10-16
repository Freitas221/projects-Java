package Entities;

public class Salary {
	
	public double salarioBruto;
	public double impost; 
	public String name;
	
	public double netSalary() {
		return (salarioBruto - impost);
	}
	
	public void  increaseSalary(double percent) {
		  salarioBruto += salarioBruto * percent / 100.0;
	}
	public String toString() {
		return name + "\nSalario liquido: $"+ String.format("%.3f", netSalary());
		
	}

}
