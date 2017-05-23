package com.casicloud.aop.mqtt.consumer.service;

public interface MqttService {
	void onMessage(String message);
}
