package com.module;

public class Machine implements Good
{
	private String name;
	private Bolt bolt;
	
	public Machine(String nameStr) {
		name=nameStr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public String toString() {return MACHINE;}
	
}
