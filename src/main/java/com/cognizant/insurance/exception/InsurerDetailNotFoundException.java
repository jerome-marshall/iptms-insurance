package com.cognizant.insurance.exception;

/**
 * 
 * custom based exception class for InsurerDetailNotFoundException
 *
 */
public class InsurerDetailNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsurerDetailNotFoundException(String message) {
		super(message);
	}

	public InsurerDetailNotFoundException() {

	}

}
