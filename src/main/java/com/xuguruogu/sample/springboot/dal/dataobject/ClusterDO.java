package com.xuguruogu.sample.springboot.dal.dataobject;

import java.util.Date;

public class ClusterDO extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3913599420538846120L;

	private Date createdTime;
	private Date modifiedTime;
	private String clusterName;
	private String comment;

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
