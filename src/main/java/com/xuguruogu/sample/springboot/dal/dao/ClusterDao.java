package com.xuguruogu.sample.springboot.dal.dao;

import com.xuguruogu.sample.springboot.dal.dataobject.ClusterDO;

public interface ClusterDao extends DaoBase<ClusterDO> {

	public ClusterDO selectByClusterName(String clusterName);
}
