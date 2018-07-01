package com.module.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import com.module.Input;

public class Employee implements Callable<List<Product>> {
	private BlockingQueue<Input> queue;
	private long time=0;
	private int unusedBolt=0,unusedMachine=0;
		
	public Employee(BlockingQueue<Input> goods, long timetakes) {
 		this.queue=goods;
		this.time=timetakes;
	}

	public List<Product> call() throws Exception {
   		  List<Product> productList=new ArrayList<>();
   		while(true) {
	 	if(queue.isEmpty()) {
			// System.out.println(" end Employee "+Thread.currentThread().getName() + " unused MACHINE "+unusedMachine+ " BOLT "+unusedBolt);
			 return productList;
		}
		
		Input in=queue.poll();
		checkandCreateProduct(productList, in); 
		
		}
	}

	private void checkandCreateProduct(List<Product> productList, Input in) throws InterruptedException {
		if(in!=null) {
			if(in.equals(Input.BOLT)){
				unusedBolt++;
		 	}else {
		 		unusedMachine++;
			}
			if(unusedBolt>=2 && unusedMachine>=1) {
	 				 productList.add(new ProductImpl());
					 System.out.println(" Thread Employee "+Thread.currentThread().getName() + " Product "+productList.size());
					 unusedBolt=unusedBolt-2;
					 unusedMachine--;
					 Thread.sleep(time*1000);
  		 	}
  		 }
	}

	 

}
