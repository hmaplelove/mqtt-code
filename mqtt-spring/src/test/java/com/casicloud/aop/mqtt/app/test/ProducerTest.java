package com.casicloud.aop.mqtt.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:**/spring-mqtt-producer.xml"})
public class ProducerTest {
	
	private static Logger logger=LoggerFactory.getLogger(ProducerTest.class);
	@Autowired
    @Qualifier("inputToMQTT")
	private MessageChannel channel;
	@Test
	public void send() throws Exception {
		Message<String> msg=MessageBuilder.withPayload("hello mqtt11").build();
		boolean flag=channel.send(msg);
		logger.info("send to mqtt ====>["+msg+"] result is "+flag);
	}
}
