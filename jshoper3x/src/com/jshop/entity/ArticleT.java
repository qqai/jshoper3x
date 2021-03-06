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
 * ArticleT generated by hbm2java
 */
@Entity
@Table(name = "article_t", catalog = "jshoper3")
public class ArticleT implements java.io.Serializable {

	private String articleid;
	private String title;
	private String metaKeywords;
	private String metaDes;
	private String contentvalue;
	private String status;
	private Date createtime;
	private String creatorid;
	private String author;
	private String ispublication;
	private String isrecommend;
	private String istop;
	private Integer readcount;
	private String htmlPath;
	private Integer pageCount;
	private String position;
	private String isnotice;
	private Date updatetime;
	private int versiont;
	private String mobilesync;
	private String tipcontent;
	private String nname;
	private String lname;
	private String sname;
	private String fname;
	private String navid;
	private String ltypeid;
	private String stypeid;
	private Integer sort;

	public ArticleT() {
	}

	public ArticleT(String articleid, String title, String contentvalue,
			String status, Date createtime, String creatorid, String author,
			String ispublication, String isrecommend, String istop,
			Date updatetime, int versiont, String mobilesync) {
		this.articleid = articleid;
		this.title = title;
		this.contentvalue = contentvalue;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.author = author;
		this.ispublication = ispublication;
		this.isrecommend = isrecommend;
		this.istop = istop;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.mobilesync = mobilesync;
	}

	public ArticleT(String articleid, String title, String metaKeywords,
			String metaDes, String contentvalue, String status,
			Date createtime, String creatorid, String author,
			String ispublication, String isrecommend, String istop,
			Integer readcount, String htmlPath, Integer pageCount,
			String position, String isnotice, Date updatetime, int versiont,
			String mobilesync, String tipcontent, String nname, String lname,
			String sname, String fname, String navid, String ltypeid,
			String stypeid, Integer sort) {
		this.articleid = articleid;
		this.title = title;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
		this.contentvalue = contentvalue;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.author = author;
		this.ispublication = ispublication;
		this.isrecommend = isrecommend;
		this.istop = istop;
		this.readcount = readcount;
		this.htmlPath = htmlPath;
		this.pageCount = pageCount;
		this.position = position;
		this.isnotice = isnotice;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.mobilesync = mobilesync;
		this.tipcontent = tipcontent;
		this.nname = nname;
		this.lname = lname;
		this.sname = sname;
		this.fname = fname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.stypeid = stypeid;
		this.sort = sort;
	}

	@Id
	@Column(name = "ARTICLEID", unique = true, nullable = false, length = 20)
	public String getArticleid() {
		return this.articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	@Column(name = "TITLE", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "META_KEYWORDS", length = 225)
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DES", length = 225)
	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	@Column(name = "CONTENTVALUE", nullable = false)
	public String getContentvalue() {
		return this.contentvalue;
	}

	public void setContentvalue(String contentvalue) {
		this.contentvalue = contentvalue;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "AUTHOR", nullable = false, length = 45)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "ISPUBLICATION", nullable = false, length = 1)
	public String getIspublication() {
		return this.ispublication;
	}

	public void setIspublication(String ispublication) {
		this.ispublication = ispublication;
	}

	@Column(name = "ISRECOMMEND", nullable = false, length = 1)
	public String getIsrecommend() {
		return this.isrecommend;
	}

	public void setIsrecommend(String isrecommend) {
		this.isrecommend = isrecommend;
	}

	@Column(name = "ISTOP", nullable = false, length = 1)
	public String getIstop() {
		return this.istop;
	}

	public void setIstop(String istop) {
		this.istop = istop;
	}

	@Column(name = "READCOUNT")
	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	@Column(name = "HTML_PATH")
	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	@Column(name = "PAGE_COUNT")
	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@Column(name = "POSITION", length = 1)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "ISNOTICE", length = 1)
	public String getIsnotice() {
		return this.isnotice;
	}

	public void setIsnotice(String isnotice) {
		this.isnotice = isnotice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "MOBILESYNC", nullable = false, length = 1)
	public String getMobilesync() {
		return this.mobilesync;
	}

	public void setMobilesync(String mobilesync) {
		this.mobilesync = mobilesync;
	}

	@Column(name = "TIPCONTENT", length = 100)
	public String getTipcontent() {
		return this.tipcontent;
	}

	public void setTipcontent(String tipcontent) {
		this.tipcontent = tipcontent;
	}

	@Column(name = "NNAME", length = 45)
	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Column(name = "LNAME", length = 45)
	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "SNAME", length = 45)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "FNAME", length = 45)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "NAVID", length = 20)
	public String getNavid() {
		return this.navid;
	}

	public void setNavid(String navid) {
		this.navid = navid;
	}

	@Column(name = "LTYPEID", length = 20)
	public String getLtypeid() {
		return this.ltypeid;
	}

	public void setLtypeid(String ltypeid) {
		this.ltypeid = ltypeid;
	}

	@Column(name = "STYPEID", length = 20)
	public String getStypeid() {
		return this.stypeid;
	}

	public void setStypeid(String stypeid) {
		this.stypeid = stypeid;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}
