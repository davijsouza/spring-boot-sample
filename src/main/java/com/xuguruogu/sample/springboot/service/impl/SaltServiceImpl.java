package com.xuguruogu.sample.springboot.service.impl;

import java.net.URI;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.xuguruogu.sample.springboot.service.SaltService;
import com.suse.salt.netapi.AuthModule;
import com.suse.salt.netapi.calls.modules.Cmd;
import com.suse.salt.netapi.calls.modules.Test;
import com.suse.salt.netapi.client.SaltClient;
import com.suse.salt.netapi.datatypes.target.Glob;
import com.suse.salt.netapi.datatypes.target.Target;
import com.suse.salt.netapi.exception.SaltException;
import com.suse.salt.netapi.results.Result;

@Service("saltService")
@ConfigurationProperties(prefix = "salt")
@Validated
public class SaltServiceImpl implements SaltService {
	@NotNull
	private String url;
	@NotNull
	private String username;
	@NotNull
	private String password;

	@Override
	public Map<String, Result<Boolean>> TestPing(String target) throws SaltException {
		SaltClient client = new SaltClient(URI.create(url));
		Target<String> globTarget = new Glob(target);

		return Test.ping().callSync(client, globTarget, username, password, AuthModule.PAM);
	}

	@Override
	public Map<String, Result<String>> CmdRun(String target, String cmd) throws SaltException {
		SaltClient client = new SaltClient(URI.create(url));
		Target<String> globTarget = new Glob(target);

		return Cmd.run(cmd).callSync(client, globTarget, username, password, AuthModule.PAM);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
