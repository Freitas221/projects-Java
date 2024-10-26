package entities;

public class PessoaFisica extends Contribuintes {

	public double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String name, double rendaAnual, double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double impostoBasico;

		if (getRendaAnual() < 20000.00) {
			impostoBasico = 0.15 * getRendaAnual() - 0.5 * getGastosSaude();
		} else {
			impostoBasico = 0.25 * getRendaAnual() - 0.5 * getGastosSaude();
		}
		if (impostoBasico < 0.0) {
			return 0.0;
		} else {
			return impostoBasico;
		}
	}

}
