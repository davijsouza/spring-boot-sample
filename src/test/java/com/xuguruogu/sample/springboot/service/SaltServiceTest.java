package com.xuguruogu.sample.springboot.service;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xuguruogu.sample.springboot.TestBase;
import com.suse.salt.netapi.exception.SaltException;
import com.suse.salt.netapi.results.Result;

public class SaltServiceTest extends TestBase {
	@Autowired
	private SaltService saltService;

	@Test
	public void testPing() throws SaltException {
		Map<String, Result<Boolean>> results = saltService.TestPing("*");
		Assert.assertNotEquals(0, results.size());

		results.forEach((minion, result) -> {
			Assert.assertEquals(false, result.error().isPresent());
			Assert.assertEquals(true, result.result().get());
		});
	}

	@Test
	public void cmdRun() throws SaltException {
		Map<String, Result<String>> results = saltService.CmdRun("*", "whoami");
		Assert.assertNotEquals(0, results.size());

		results.forEach((minion, result) -> {
			Assert.assertEquals(false, result.error().isPresent());
			Assert.assertEquals("root", result.result().get());
		});
	}

}
