package com.casicloud.aop.mqtt.consumer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.casicloud.aop.mqtt.consumer.service.MqttService;

public class SimpleMqttService implements MqttService{
	private static Logger logger=LoggerFactory.getLogger(SimpleMqttService.class);
	@Override
	public void onMessage(String message) {
		logger.info("SimpleMqttService.onMessage============>"+message);
	}

}
