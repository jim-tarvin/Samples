package com.ramfam.visitor;

public class Rectangle implements Shape {

	private double length = 1;
	private double width = 1;

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;

	}

	public double getLength() {

		return length;

	}

	public double getWidth() {

		return width;

	}

	@Override
	public void accept(ShapeVisitor v) {

		v.visit(this);

	}
}
