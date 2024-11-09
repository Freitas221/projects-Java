package Entities;

public class ProdutoImportado extends Produto {

	private double custoDeImpotacao;

	ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String name, double price, double custoDeImpotacao) {
		super(name, price);
		this.custoDeImpotacao = custoDeImpotacao;
	}

	public double getCustoDeImpotacao() {
		return custoDeImpotacao;
	}

	public void setCustoDeImpotacao(double custoDeImpotacao) {
		this.custoDeImpotacao = custoDeImpotacao;
	}
	
	public double totalPrice() {
		return getPrice() + custoDeImpotacao;	
	}
	
	@Override
	public String priceTag() {
		
		return getName()
				+
				("Preço: \n")
				+
				 String.format("%.2f", price )
				+
				 String.format("%.2f", custoDeImpotacao)
				+("Custo da taxa: $ 20.00");
	}

}
