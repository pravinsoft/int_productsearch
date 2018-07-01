package com.module.process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.module.Conveyer;
import com.module.Input;
import com.module.domain.Employee;
import com.module.domain.Product;
import com.module.factory.CreateInputFactory;

public class ProcessorService {
	private ProcessInput processinput;
	private ProcessOutput processoutput;

	
	public ProcessorService(ProcessInput input) {
		this.processinput=input;
		
	}
	
	public ProcessOutput process() throws InterruptedException, ExecutionException {
		
        
        BlockingQueue<Input> goods = getConveyerGoods();
     
        Employee employee;
         List<Future> lFutures= new ArrayList<>();
        
        ExecutorService executorService = Executors.newFixedThreadPool(processinput.getEmployee());
        for(int i =0; i< processinput.getEmployee();i++) {
              employee=new Employee(goods, processinput.getTimetaken());
               lFutures.add(executorService.submit(employee));
 
        }
        int size = 0;
		long time=0;
 
		for (Iterator iterator = lFutures.iterator(); iterator.hasNext();) {
			Future future = (Future) iterator.next();
			size=size+((List<Product>)future.get()).size();
			time=time+(((List<Product>)future.get()).size() * processinput.getTimetaken());
		}
    
        executorService.shutdown();
		return new ProcessOutput(time, size);
		
	}

	private BlockingQueue<Input> getConveyerGoods() {
		List<Input> list=new ArrayList<>();
        list.addAll(CreateInputFactory.createInputs(Input.BOLT, processinput.getBolt()));
        list.addAll(CreateInputFactory.createInputs(Input.MACHINE, processinput.getMachine()));
        Collections.shuffle(list,new Random());
        Conveyer.getInstance().addInputs(list);
        BlockingQueue<Input> goods=Conveyer.getInstance().getConveyerQueu();
		return goods;
	}

}
