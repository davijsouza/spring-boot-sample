package com.xuguruogu.sample.springboot.exception;

public class SampleException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4206404092785733482L;

	public SampleException(String message) {
		super(message);
	}

	public SampleException(String message, Throwable cause) {
		super(message, cause);
	}

	public SampleException(Throwable cause) {
		super(cause);
	}
}
