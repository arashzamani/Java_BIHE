package org.bihe.command.producerServices;

import org.bihe.command.Service;
import org.bihe.entity.Producer;

public class MoveToWarehouse implements Service {

	private Producer producer;

	
	
	public MoveToWarehouse(Producer producer) {
		super();
		this.producer = producer;
	}



	@Override
	public Service handleService() {
		
		return producer.moveToWarehouse();
	}

}
