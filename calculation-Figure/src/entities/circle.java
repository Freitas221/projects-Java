package entities;

import entities.enums.Color;

public class circle extends AbstractShape {

	private double radius;
	
	
	public circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
