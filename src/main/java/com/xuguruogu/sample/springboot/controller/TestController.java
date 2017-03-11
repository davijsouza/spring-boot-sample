package com.xuguruogu.sample.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suse.salt.netapi.exception.SaltException;
import com.suse.salt.netapi.results.Result;
import com.xuguruogu.sample.springboot.service.SaltService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private SaltService saltService;

	@RequestMapping(value = { "" }, method = { RequestMethod.GET })
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "1");
		map.put("codeMsg", "success");
		return map;
	}

	@RequestMapping(value = { "/ping" }, method = { RequestMethod.GET })
	public Map<String, Result<Boolean>> test() throws SaltException {
		return saltService.TestPing("*");
	}
}
