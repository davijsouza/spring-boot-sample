package com.xuguruogu.sample.springboot.result;

import java.util.HashMap;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;

public class ErrorResult extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3097791535483460568L;

	public ErrorResult(Exception ex) {
		this.put("status", 500);

		if (ex instanceof BindException) {
			// 绑定错误
			String msg = new String();
			for (ObjectError err : ((BindException) ex).getAllErrors()) {
				msg += err.getDefaultMessage() + "\n\r";
			}
			this.put("error", msg);
		} else {
			this.put("error", ex.getMessage());
		}

	}
}
