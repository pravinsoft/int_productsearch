package com.module.factory;

import java.util.ArrayList;
import java.util.List;

import com.module.Input;

public class CreateInputFactory {
	
	 

	public static List<Input> createInputs(Input bolt2,long number) {
		
		if(Input.BOLT.equals(bolt2)) {
			return getList(Input.BOLT,number);
		}else if(Input.MACHINE.equals(bolt2)){
			return getList(Input.MACHINE,number);
		}
		return null;
		
		
	}

	private static List<Input> getList(Input bolt2, long number) {
		List<Input> list=new ArrayList<Input>();
		for (int i = 0; i <number; i++) {
			list.add(bolt2);
			
		}
		return list;
	}

}
