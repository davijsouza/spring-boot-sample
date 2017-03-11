package com.xuguruogu.sample.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xuguruogu.sample.springboot.exception.SampleException;

@RestController
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = { RequestMethod.GET })
	public String index() {

		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/json", method = { RequestMethod.GET })
	public String json() throws SampleException {
		throw new SampleException("发生错误2");
	}
}