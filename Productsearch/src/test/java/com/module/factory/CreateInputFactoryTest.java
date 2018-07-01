package com.module.factory;

import com.module.Input;

import junit.framework.TestCase;

public class CreateInputFactoryTest extends TestCase{

	public void testcreateInputs() {
		
	 assertEquals(2,CreateInputFactory.createInputs(Input.BOLT, 2).size());
	 assertEquals(2,CreateInputFactory.createInputs(Input.MACHINE, 2).size());
	
	 assertEquals(Input.MACHINE,CreateInputFactory.createInputs(Input.MACHINE, 1).get(0));
	 assertEquals(Input.BOLT,CreateInputFactory.createInputs(Input.BOLT, 1).get(0));
			
	
	}
	
	

}
