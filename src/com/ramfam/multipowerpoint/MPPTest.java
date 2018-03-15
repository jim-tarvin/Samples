package com.ramfam.multipowerpoint;

import java.util.Random;
import java.util.Scanner;

public class MPPTest {

	private static int blenders = 0;
	private static int ovens = 0;
	private static int toasters = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		MultiPowerPoint mpp = new MultiPowerPoint();
		int count = 5;
		char action;

		if (args.length > 0) {

			try {

				count = Integer.parseInt(args[0]);

			} catch (NumberFormatException e) {

				System.out.println("Invalid number, please try again");
				return;

			}

		}

		System.out.println("Creating " + count + " random appliances");

		while (count > 0) {

			mpp.plugIn(randomAppliance(random));
			count--;

		}


		while (true) {

			System.out.println("Choose an action [0|1|.]: ");
			System.out.println("	0 = off");
			System.out.println("	1 = on");
			System.out.println("	. = exit");
			System.out.println();

			try {

				action = scanner.next(".").toLowerCase().charAt(0);

			} catch (Exception e) {

				System.out.println("Error on input, please try again (" + e.toString() + ")");
				scanner.nextLine();
				continue;    // don't count this attempt

			}

			switch (action) {
				case '0':
					mpp.off();
					break;

				case '1':
					mpp.on();
					break;

				case '.':
					System.out.println("Goodbye!");
					return;

				default:
					System.out.println("unknown input value, please try again");
					break;
			}
		}

	}

	private static Appliance randomAppliance(Random random) {

		Appliance result = null;

		switch (random.nextInt(3)) {
			case 0:
				result = new BlenderWrap("Blender#" + (++blenders));
				break;

			case 1:
				result = new ToasterWrap("Toaster#" + (++toasters));
				break;

			case 2:
				result = new OvenWrap("Oven#" + (++ovens));
				break;

			default:
				System.out.println("Can't make an appliance : random failure (lol)");
				break;
		}

		return result;
	}
}
