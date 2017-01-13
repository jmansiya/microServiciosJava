package net.jose.mansilla.greeting.DTOs;

import java.io.Serializable;

public class Greeting implements Serializable{
	private static final long serialVersionUID = 1L;
	private final String content;
	
	public Greeting(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
}
