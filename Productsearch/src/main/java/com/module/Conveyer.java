package com.module;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

//signletone
public class Conveyer {
	
	
	private static Conveyer conveyer=new Conveyer();
	
	private BlockingQueue<Input> belt=new LinkedBlockingDeque<Input>();
	
	private Conveyer() {
		
	}
	
	public static Conveyer getInstance() {
		return conveyer;
	}
	
	public  void addInputs(List<Input> list) {
		belt.addAll(list);
	}
	
	public  BlockingQueue<Input> getConveyerQueu() {
		return belt;
	}
	

}
