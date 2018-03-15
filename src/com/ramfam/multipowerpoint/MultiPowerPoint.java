package com.ramfam.multipowerpoint;

import java.util.ArrayList;
import java.util.List;

public class MultiPowerPoint {

	private List<Appliance> appliances = new ArrayList<>();

	MultiPowerPoint() {

	}

	public void plugIn(Appliance appliance) {

		appliances.add(appliance);

	}

	public void on() {

		for (Appliance a : appliances) {
			a.turnOn();
		}

	}

	public void off() {

		for (Appliance a : appliances) {
			a.turnOff();
		}

	}
}
