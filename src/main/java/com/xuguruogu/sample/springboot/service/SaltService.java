package com.xuguruogu.sample.springboot.service;

import java.util.Map;

import com.suse.salt.netapi.exception.SaltException;
import com.suse.salt.netapi.results.Result;

public interface SaltService {
	public Map<String, Result<Boolean>> TestPing(String target) throws SaltException;

	public Map<String, Result<String>> CmdRun(String target, String cmd) throws SaltException;
}
