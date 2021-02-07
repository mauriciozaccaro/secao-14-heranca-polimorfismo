package entities;

import entities.enums.Color;

public class Circle extends Shapes {
	
	//private static Double PI = 3.14159;	// Não precisa porque vou puxar do Math.PI
	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}


	public Double area() {
		return Math.PI * (this.radius * this.radius);
	}
	
}
