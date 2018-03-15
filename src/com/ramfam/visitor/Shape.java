package com.ramfam.visitor;

public interface Shape {

	void accept(ShapeVisitor v);

	// I chose not to do a Shape.getArea() method in order to highlight the Visitor pattern approach

}
