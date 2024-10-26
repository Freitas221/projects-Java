package entities;

public class PessoaJuridica extends Contribuintes{

	public int Funcionarios;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String name, double rendaAnual, int funcionarios) {
		super(name, rendaAnual);
		Funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		Funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		double imposto;
		
		if(Funcionarios > 10) {
			imposto = 0.14 * getRendaAnual();
		}
		else{
			imposto = 0.16 * getRendaAnual();
		}
		
		
		return imposto;
	}

}
