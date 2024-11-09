package Entities;

import java.util.Date;

public class ProdutoUsado extends Produto {
	
	protected Date dataDeFabricacao;
	
	ProdutoUsado(){
		super();
	}


	public ProdutoUsado(String name, double price, Date dataDeFabricacao) {
		super(name, price);
		this.dataDeFabricacao = dataDeFabricacao;
	}


	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}


	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ ("Price: ")
				+ price + 
				("Data de fabricação: ")
				+ dataDeFabricacao;
	}
	
}