package net.microservice.greeting.model.exception;

import org.springframework.core.NestedRuntimeException;

public class UserNotFoundException extends NestedRuntimeException {

	public UserNotFoundException(String userID) {
		super("Usuario con " + userID + " no exise");
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
