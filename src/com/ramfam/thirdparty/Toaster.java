package com.ramfam.thirdparty;

public class Toaster {

	private String name;

	public Toaster(String name) {
		this.name = name;
	}

	public void startToasting() {
		System.out.println("Toaster '" + name + "' is now toasting");
	}

	public void popItUp() {
		System.out.println("Toaster '" + name + "' has stopped toasting");
	}
}
