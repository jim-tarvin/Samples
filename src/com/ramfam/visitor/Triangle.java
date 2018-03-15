package com.ramfam.visitor;

public class Triangle implements Shape {

	private double base = 1;
	private double height = 1;

	public Triangle(double base, double height) {

		this.base = base;
		this.height = height;

	}

	public double getBase() {

		return base;

	}

	public double getHeight() {

		return height;

	}


	@Override
	public void accept(ShapeVisitor v) {

		v.visit(this);

	}

}
