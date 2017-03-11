package com.xuguruogu.sample.springboot.dao;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.xuguruogu.sample.springboot.TestBase;
import com.xuguruogu.sample.springboot.dal.dao.ClusterDao;
import com.xuguruogu.sample.springboot.dal.dataobject.ClusterDO;

public class ClusterDaoTest extends TestBase{

	@Autowired
	private ClusterDao clusterDao;

	@Test
	@Rollback
	public void dao() {
		ClusterDO cluster = new ClusterDO();
		cluster.setCreatedTime(new Date());
		cluster.setComment("hello");
		cluster.setClusterName("cluster_name");
		Assert.assertEquals(1, clusterDao.insert(cluster));
		ClusterDO query = clusterDao.selectByClusterName(cluster.getClusterName());
		Assert.assertNotNull(query);
		Assert.assertNotNull(clusterDao.selectById(query.getId()));

	}

}
