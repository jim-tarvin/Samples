package com.ramfam.multipowerpoint;

import com.ramfam.thirdparty.Oven;

public class OvenWrap implements Appliance {

	private Oven oven;

	OvenWrap(String name) {

		oven = new Oven(name);

	}

	@Override
	public void turnOn() {

		oven.headUup();

	}

	@Override
	public void turnOff() {

		oven.shutOff();

	}
}
