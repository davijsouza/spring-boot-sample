package com.xuguruogu.sample.springboot.dao;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.xuguruogu.sample.springboot.TestBase;
import com.xuguruogu.sample.springboot.dal.dao.ProxyDao;
import com.xuguruogu.sample.springboot.dal.dataobject.ProxyDO;

public class ProxyDaoTest extends TestBase {

	@Autowired
	private ProxyDao proxyDao;

	@Test
	@Rollback
	public void dao() {

		ProxyDO proxy = new ProxyDO();
		proxy.setCreatedTime(new Date());
		proxy.setClusterId(100);
		proxy.setIp("10.10.10.10");
		proxy.setPort(6000);
		Assert.assertEquals(1, proxyDao.insert(proxy));
		proxy.setPort(6001);
		Assert.assertEquals(1, proxyDao.insert(proxy));
		Assert.assertEquals(2, proxyDao.selectListByClusterId(100).size());
	}

}
