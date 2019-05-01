package com.kafka.kafakProducer.pojo;

import java.io.Serializable;

public class Object implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String file_name;
	private String value_file;

	
	public Object(String file_name, String value_file) {
		super();
		this.file_name= file_name;
		this.value_file = value_file;
	}
	public Object() {
		super();
		
	}
	
	public String get_file_name() {
		return file_name;
	}



	public void set_file_name(String file_name) {
		this.file_name = file_name;
	}

	public String get_value_file() {
		return value_file;
	}

	public void set_value_file(String value_file) {
		this.value_file = value_file;
	}
}
