package com.module;

public class Bolt implements Good
{
	private String name;
	
	public Bolt(String nameStr) {
		name=nameStr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {return BOLT;}
	
}
