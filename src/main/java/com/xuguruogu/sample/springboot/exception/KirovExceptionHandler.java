package com.xuguruogu.sample.springboot.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuguruogu.sample.springboot.result.ErrorResult;

@ControllerAdvice
public class KirovExceptionHandler {

	private static Logger logger = LoggerFactory.getLogger(KirovExceptionHandler.class);

	@ExceptionHandler(value = SampleException.class)
	@ResponseBody
	public ErrorResult handleKirovException(HttpServletRequest request, SampleException ex) throws IOException {
		logger.error(ex.getMessage(), ex);
		return new ErrorResult(ex);
	}
}
