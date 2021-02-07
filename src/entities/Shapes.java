package entities;

import entities.enums.Color;

public abstract class Shapes {
	
	private Color color;
	
	public Shapes() {
		super();
	}

	public Shapes(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
	
}
