package com.ramfam.multipowerpoint;

import com.ramfam.thirdparty.Toaster;

public class ToasterWrap implements Appliance {

	private Toaster toaster;

	ToasterWrap(String name) {

		toaster = new Toaster(name);

	}

	@Override
	public void turnOn() {

		toaster.startToasting();

	}

	@Override
	public void turnOff() {

		toaster.popItUp();

	}
}
