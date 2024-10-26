package entities;

import entities.enums.Color;

public class Retangle extends AbstractShape {
	
	private double largura;
	private double altuta;
	

	public Retangle(Color color, double largura, double altuta) {
		super(color);
		this.largura = largura;
		this.altuta = altuta;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltuta() {
		return altuta;
	}

	public void setAltuta(double altuta) {
		this.altuta = altuta;
	}

	@Override
	public double area() {
		return getAltuta() * getLargura();
	}
	
	

}
