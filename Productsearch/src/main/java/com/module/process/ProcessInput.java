package com.module.process;

public class ProcessInput {
	
	private long timetaken;
	private long bolt;
	private long machine;
	private int employee;
	
	
	
	public ProcessInput(long timetaken, long bolt, long machine, int employee) {
		super();
		this.timetaken = timetaken;
		this.bolt = bolt;
		this.machine = machine;
		this.employee = employee;
	}
	
	public long getTimetaken() {
		return timetaken;
	}
	public void setTimetaken(long timetaken) {
		this.timetaken = timetaken;
	}
	public long getBolt() {
		return bolt;
	}
	public void setBolt(long bolt) {
		this.bolt = bolt;
	}
	public long getMachine() {
		return machine;
	}
	public void setMachine(long machine) {
		this.machine = machine;
	}
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	

}
