package com.ramfam.thirdparty;

public class Blender {

	private String name;

	public Blender(String name) {
		this.name = name;
	}

	public void swizzle() {
		System.out.println("Blender '" + name + "' is now blending");
	}

	public void stopTheSwizzle() {
		System.out.println("Blender '" + name + "' has stopped blending");
	}
}
