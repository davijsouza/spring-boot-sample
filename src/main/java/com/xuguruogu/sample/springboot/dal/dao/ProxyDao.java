package com.xuguruogu.sample.springboot.dal.dao;

import java.util.List;

import com.xuguruogu.sample.springboot.dal.dataobject.ProxyDO;

public interface ProxyDao extends DaoBase<ProxyDO> {
	
	public List<ProxyDO> selectListByClusterId(long clusterId);
}
