package com.ramfam.multipowerpoint;

import com.ramfam.thirdparty.Blender;

public class BlenderWrap implements Appliance {

	private Blender blender;

	BlenderWrap(String name) {

		blender = new Blender(name);

	}

	@Override
	public void turnOn() {

		blender.swizzle();

	}

	@Override
	public void turnOff() {

		blender.stopTheSwizzle();

	}
}
