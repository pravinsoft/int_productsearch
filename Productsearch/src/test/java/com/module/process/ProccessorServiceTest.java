package com.module.process;

import java.util.concurrent.ExecutionException;

import junit.framework.TestCase;

public class ProccessorServiceTest extends TestCase {

	private ProcessorService service;
	
	protected void setUp() throws Exception {
		super.setUp();
		service=new ProcessorService(new ProcessInput(2, 4, 2, 1));
	}
	
	public void testProcess() throws InterruptedException, ExecutionException
    {
		ProcessOutput out=service.process();
        assertNotNull(out);
        assertEquals(2,out.getProduct());
        assertEquals(4,out.getTimetaken());

    }
	public void testProcess1() throws InterruptedException, ExecutionException
    {
        assertNotNull(service.process());
    }

}
