package com.kafka.kafakProducer;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;


import com.kafka.kafakProducer.constants.IKafkaConstants;

import com.kafka.kafakProducer.producer.producerkafk;
import com.kafka.kafakProducer.pojo.Object;

public class App {
	public static void main(String[] args) {
	runProducer();
		
	}

	

	static void runProducer()  {
		
		CSVReader reader;
		try {
			reader = new CSVReader(
					new FileReader("C:\\Users\\PC\\Desktop\\annlatex\\kafak-Producer\\src\\main\\resources\\tawfik.csv"));
			
			String[] nextLine;
			Producer<String, Object> producer =  producerkafk.createProducer();
			
			try {
				while ((nextLine = reader.readNext()) != null) {
					
					
					for (String cell : nextLine) { 
		              // send each line of cvs file 
		                System.out.println("Send message" +  cell);
		                producer.send(new ProducerRecord<String, Object>(IKafkaConstants.TOPIC_NAME, "tt", new Object("1", cell)));
		            } 
		            System.out.println(); 
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		
		
		
	}
}
