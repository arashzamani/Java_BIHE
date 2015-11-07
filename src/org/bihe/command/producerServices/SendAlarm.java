package org.bihe.command.producerServices;

import org.bihe.command.Service;
import org.bihe.entity.Producer;

public class SendAlarm implements Service {

	private Producer producer;

	public SendAlarm(Producer producer) {
		this.producer = producer;
	}

	@Override
	public Service handleService() {
		return producer.sendAlarm();
	}

}
