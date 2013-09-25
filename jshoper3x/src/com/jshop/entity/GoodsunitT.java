package com.jshop.entity;

// Generated 2013-9-25 20:51:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsunitT generated by hbm2java
 */
@Entity
@Table(name = "goodsunit_t", catalog = "jshoper3")
public class GoodsunitT implements java.io.Serializable {

	private String unitid;
	private String unitname;
	private String engunitname;
	private String creatorid;
	private Date createtime;

	public GoodsunitT() {
	}

	public GoodsunitT(String unitid, String unitname, String creatorid,
			Date createtime) {
		this.unitid = unitid;
		this.unitname = unitname;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	public GoodsunitT(String unitid, String unitname, String engunitname,
			String creatorid, Date createtime) {
		this.unitid = unitid;
		this.unitname = unitname;
		this.engunitname = engunitname;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "UNITID", unique = true, nullable = false, length = 20)
	public String getUnitid() {
		return this.unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	@Column(name = "UNITNAME", nullable = false, length = 45)
	public String getUnitname() {
		return this.unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	@Column(name = "ENGUNITNAME", length = 20)
	public String getEngunitname() {
		return this.engunitname;
	}

	public void setEngunitname(String engunitname) {
		this.engunitname = engunitname;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
