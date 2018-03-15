package com.ramfam.visitor;

import java.util.Scanner;

public class VisitorTest {

	public static void main(String[] args) {

		ShapeVisitor v = new AreaVisitor();
		Scanner scanner = new Scanner(System.in);
		char type;


		System.out.println("You will be prompted to enter a shape and appropriate dimensions for that shape");
		System.out.println("	c = circle");
		System.out.println("	r = rectangle");
		System.out.println("	t = triangle");
		System.out.println("	. = exit");


		while (true) {

			System.out.print("Type of Shape [c|r|t|.]: ");

			try {
				type = scanner.next(".").toLowerCase().charAt(0);
			} catch (Exception e) {
				System.out.println("Error on input, please try again (" + e.toString() + ")");
				scanner.nextLine();
				continue;
			}

			switch (type) {
				case 'c':
					doCircle(v, scanner);
					break;

				case 'r':
					toRectangle(v, scanner);
					break;

				case 't':
					doTriangle(v, scanner);
					break;

				case '.':
					return;

				default:
					System.out.println("unknown shape, please try again!");
					continue;
			}

		}
	}

	// I chose to put each shape in it's own function to isolate the handling of exceptions on input
	// No attempt to capture/store/save the shapes at this time

	private static void doTriangle(ShapeVisitor v, Scanner scanner) {

		double base;
		double height;

		try {

			System.out.print("Enter the base length: ");
			base = scanner.nextDouble();

		} catch (Exception e) {

			System.out.println("Error on input, please start over (" + e.toString() + ")");
			scanner.nextLine();
			return;

		}

		try {

			System.out.print("Enter the height: ");
			height = scanner.nextDouble();

		} catch (Exception e) {

			System.out.println("Error on input, please start over (" + e.toString() + ")");
			scanner.nextLine();
			return;

		}

		Shape shape = new Triangle(base, height);
		shape.accept(v);

	}

	private static void toRectangle(ShapeVisitor v, Scanner scanner) {

		double length;
		double width;

		try {

			System.out.print("Enter the length: ");
			length = scanner.nextDouble();

		} catch (Exception e) {

			System.out.println("Error on input, please start over (" + e.toString() + ")");
			scanner.nextLine();
			return;

		}

		try {

			System.out.print("Enter the width: ");
			width = scanner.nextDouble();

		} catch (Exception e) {

			System.out.println("Error on input, please start over (" + e.toString() + ")");
			scanner.nextLine();
			return;

		}

		Shape shape = new Rectangle(length, width);
		shape.accept(v);

	}

	private static void doCircle(ShapeVisitor v, Scanner scanner) {

		try {

			System.out.print("Enter the radius: ");
			new Circle(scanner.nextDouble()).accept(v);

		} catch (Exception e) {

			System.out.println("Error on input, please start over (" + e.toString() + ")");
			scanner.nextLine();

		}
	}


}
