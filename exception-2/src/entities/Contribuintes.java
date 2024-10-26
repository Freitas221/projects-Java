package entities;

public abstract class Contribuintes {

	public String name;
	public double rendaAnual;
	
	 Contribuintes() {
		 super();
	}
	 
	 Contribuintes(String name, double rendaAnual){
		 
		 this.name = name;
		 this.rendaAnual = rendaAnual;	 
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	 
	public abstract double imposto();
}


