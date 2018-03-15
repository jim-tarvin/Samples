package com.ramfam.thirdparty;

public class Oven {

	private String name;

	public Oven(String name) {
		this.name = name;
	}

	public void headUup() {
		System.out.println("Oven '" + name + " is now heating");
	}

	public void shutOff() {
		System.out.println("Oven '" + name + " has stopped heating");
	}
}
