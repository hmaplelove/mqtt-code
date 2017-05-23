package com.casicloud.aop.mqtt.app.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring-mqtt-consumer.xml"});
		applicationContext.start();
	}
}
