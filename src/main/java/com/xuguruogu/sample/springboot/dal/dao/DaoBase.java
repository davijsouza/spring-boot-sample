package com.xuguruogu.sample.springboot.dal.dao;

import com.xuguruogu.sample.springboot.dal.dataobject.Entity;

public interface DaoBase<T extends Entity> {

	public long insert(T entity);

	public T selectById(long id);

}
