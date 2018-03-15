package com.ramfam.visitor;

public class Circle implements Shape {


	private double radius = 1;

	public Circle(double radius) {

		this.radius = radius;

	}

	public double getRadius() {

		return radius;

	}

	@Override
	public void accept(ShapeVisitor v) {

		v.visit(this);

	}
}
