package com.xuguruogu.sample.springboot.result;

import java.util.HashMap;

public class SuccessResult extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8973317737714695329L;

	public SuccessResult() {
		this.put("status", 200);
	}
}
