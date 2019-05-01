package com.kafka.kafakProducer.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;


import com.kafka.kafakProducer.constants.IKafkaConstants;
import com.kafka.kafakProducer.pojo.Object;

public class producerkafk {

	public static Producer<String, Object> createProducer() {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
		props.put(ProducerConfig.CLIENT_ID_CONFIG, IKafkaConstants.CLIENT_ID);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "com.kafka.kafakProducer.serializer.CustomSerializer");
		return new KafkaProducer<>(props);
	}
}