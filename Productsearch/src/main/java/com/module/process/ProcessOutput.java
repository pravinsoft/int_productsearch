package com.module.process;

public class ProcessOutput {
	
	private long timetaken;
	private long product;
	 
	
	
	public ProcessOutput(long timetaken, long bolt ) {
		super();
		this.timetaken = timetaken;
		this.product = bolt; 
	}
	
	public long getTimetaken() {
		return timetaken;
	}
	public void setTimetaken(long timetaken) {
		this.timetaken = timetaken;
	}
	public long getProduct() {
		return product;
	}
	public void setProduct(long bolt) {
		this.product = bolt;
	} 
}
