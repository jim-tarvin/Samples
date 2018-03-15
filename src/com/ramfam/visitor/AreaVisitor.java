package com.ramfam.visitor;

/**
 * to highlight using the com.ramfam.visitor pattern, rather than just call an abstract 'getArea()' method, I had each specific
 * com.ramfam.visitor method access the methods specific to the shape to calculate the area.
 */

public class AreaVisitor implements ShapeVisitor {

	@Override
	public void visit(Circle circle) {

		// pie * radius squared
		double area = Math.PI * (circle.getRadius() * circle.getRadius());
		System.out.println("A Circle with radius " + circle.getRadius() + " has an area of " + area);

	}

	@Override
	public void visit(Rectangle rectangle) {

		// length * width
		double area = rectangle.getLength() * rectangle.getWidth();
		System.out.println("A Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth() +
				" has an area of " + area);

	}

	@Override
	public void visit(Triangle triangle) {

		// 1/2 base * height
		double area = (triangle.getBase() * triangle.getHeight()) / 2.0;
		System.out.println("A triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() +
				" has an area of " + area);

	}

}
