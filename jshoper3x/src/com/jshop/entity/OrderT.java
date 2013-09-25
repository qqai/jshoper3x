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
 * OrderT generated by hbm2java
 */
@Entity
@Table(name = "order_t", catalog = "jshoper3")
public class OrderT implements java.io.Serializable {

	private String orderid;
	private String memberid;
	private String membername;
	private String paymentid;
	private String paymentname;
	private String delivermode;
	private String deliverynumber;
	private String orderstate;
	private String logisticsid;
	private double freight;
	private double amount;
	private double points;
	private Date purchasetime;
	private Date deliverytime;
	private String isinvoice;
	private String shippingaddressid;
	private String customerordernotes;
	private String logisticswebaddress;
	private Date paytime;
	private String orderTag;
	private String toBuyerNotes;
	private double shouldpay;
	private double usepoints;
	private String vouchersid;
	private String goodid;
	private String goodsname;
	private int needquantity;
	private String paystate;
	private String shippingstate;
	private String deliveraddressid;
	private String shippingusername;
	private Date createtime;
	private String isprintexpress;
	private String isprintinvoice;
	private String isprintfpinvoice;
	private String expressnumber;
	private String tradeNo;
	private String userid;
	private String username;
	private String logisticsname;
	private String errorOrderTag;
	private String productinfo;
	private String goodsinfo;
	private Integer versiont;
	private String ordername;
	private String shopid;

	public OrderT() {
	}

	public OrderT(String orderid, String memberid, String membername,
			String paymentid, String paymentname, String delivermode,
			String orderstate, String logisticsid, double freight,
			double amount, double points, Date purchasetime, String isinvoice,
			String orderTag, double shouldpay, double usepoints,
			int needquantity, String paystate, String productinfo,
			String goodsinfo, String ordername) {
		this.orderid = orderid;
		this.memberid = memberid;
		this.membername = membername;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.delivermode = delivermode;
		this.orderstate = orderstate;
		this.logisticsid = logisticsid;
		this.freight = freight;
		this.amount = amount;
		this.points = points;
		this.purchasetime = purchasetime;
		this.isinvoice = isinvoice;
		this.orderTag = orderTag;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.needquantity = needquantity;
		this.paystate = paystate;
		this.productinfo = productinfo;
		this.goodsinfo = goodsinfo;
		this.ordername = ordername;
	}

	public OrderT(String orderid, String memberid, String membername,
			String paymentid, String paymentname, String delivermode,
			String deliverynumber, String orderstate, String logisticsid,
			double freight, double amount, double points, Date purchasetime,
			Date deliverytime, String isinvoice, String shippingaddressid,
			String customerordernotes, String logisticswebaddress,
			Date paytime, String orderTag, String toBuyerNotes,
			double shouldpay, double usepoints, String vouchersid,
			String goodid, String goodsname, int needquantity, String paystate,
			String shippingstate, String deliveraddressid,
			String shippingusername, Date createtime, String isprintexpress,
			String isprintinvoice, String isprintfpinvoice,
			String expressnumber, String tradeNo, String userid,
			String username, String logisticsname, String errorOrderTag,
			String productinfo, String goodsinfo, Integer versiont,
			String ordername, String shopid) {
		this.orderid = orderid;
		this.memberid = memberid;
		this.membername = membername;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.delivermode = delivermode;
		this.deliverynumber = deliverynumber;
		this.orderstate = orderstate;
		this.logisticsid = logisticsid;
		this.freight = freight;
		this.amount = amount;
		this.points = points;
		this.purchasetime = purchasetime;
		this.deliverytime = deliverytime;
		this.isinvoice = isinvoice;
		this.shippingaddressid = shippingaddressid;
		this.customerordernotes = customerordernotes;
		this.logisticswebaddress = logisticswebaddress;
		this.paytime = paytime;
		this.orderTag = orderTag;
		this.toBuyerNotes = toBuyerNotes;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.vouchersid = vouchersid;
		this.goodid = goodid;
		this.goodsname = goodsname;
		this.needquantity = needquantity;
		this.paystate = paystate;
		this.shippingstate = shippingstate;
		this.deliveraddressid = deliveraddressid;
		this.shippingusername = shippingusername;
		this.createtime = createtime;
		this.isprintexpress = isprintexpress;
		this.isprintinvoice = isprintinvoice;
		this.isprintfpinvoice = isprintfpinvoice;
		this.expressnumber = expressnumber;
		this.tradeNo = tradeNo;
		this.userid = userid;
		this.username = username;
		this.logisticsname = logisticsname;
		this.errorOrderTag = errorOrderTag;
		this.productinfo = productinfo;
		this.goodsinfo = goodsinfo;
		this.versiont = versiont;
		this.ordername = ordername;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ORDERID", unique = true, nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "MEMBERNAME", nullable = false, length = 50)
	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	@Column(name = "PAYMENTID", nullable = false, length = 20)
	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	@Column(name = "PAYMENTNAME", nullable = false, length = 50)
	public String getPaymentname() {
		return this.paymentname;
	}

	public void setPaymentname(String paymentname) {
		this.paymentname = paymentname;
	}

	@Column(name = "DELIVERMODE", nullable = false, length = 50)
	public String getDelivermode() {
		return this.delivermode;
	}

	public void setDelivermode(String delivermode) {
		this.delivermode = delivermode;
	}

	@Column(name = "DELIVERYNUMBER", length = 50)
	public String getDeliverynumber() {
		return this.deliverynumber;
	}

	public void setDeliverynumber(String deliverynumber) {
		this.deliverynumber = deliverynumber;
	}

	@Column(name = "ORDERSTATE", nullable = false, length = 1)
	public String getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}

	@Column(name = "LOGISTICSID", nullable = false, length = 20)
	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	@Column(name = "FREIGHT", nullable = false, precision = 22, scale = 0)
	public double getFreight() {
		return this.freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 10)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "POINTS", nullable = false, precision = 10)
	public double getPoints() {
		return this.points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PURCHASETIME", nullable = false, length = 0)
	public Date getPurchasetime() {
		return this.purchasetime;
	}

	public void setPurchasetime(Date purchasetime) {
		this.purchasetime = purchasetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DELIVERYTIME", length = 0)
	public Date getDeliverytime() {
		return this.deliverytime;
	}

	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	@Column(name = "ISINVOICE", nullable = false, length = 1)
	public String getIsinvoice() {
		return this.isinvoice;
	}

	public void setIsinvoice(String isinvoice) {
		this.isinvoice = isinvoice;
	}

	@Column(name = "SHIPPINGADDRESSID", length = 20)
	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	@Column(name = "CUSTOMERORDERNOTES", length = 100)
	public String getCustomerordernotes() {
		return this.customerordernotes;
	}

	public void setCustomerordernotes(String customerordernotes) {
		this.customerordernotes = customerordernotes;
	}

	@Column(name = "LOGISTICSWEBADDRESS", length = 225)
	public String getLogisticswebaddress() {
		return this.logisticswebaddress;
	}

	public void setLogisticswebaddress(String logisticswebaddress) {
		this.logisticswebaddress = logisticswebaddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYTIME", length = 0)
	public Date getPaytime() {
		return this.paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	@Column(name = "ORDER_TAG", nullable = false, length = 1)
	public String getOrderTag() {
		return this.orderTag;
	}

	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}

	@Column(name = "TO_BUYER_NOTES", length = 100)
	public String getToBuyerNotes() {
		return this.toBuyerNotes;
	}

	public void setToBuyerNotes(String toBuyerNotes) {
		this.toBuyerNotes = toBuyerNotes;
	}

	@Column(name = "SHOULDPAY", nullable = false, precision = 10)
	public double getShouldpay() {
		return this.shouldpay;
	}

	public void setShouldpay(double shouldpay) {
		this.shouldpay = shouldpay;
	}

	@Column(name = "USEPOINTS", nullable = false, precision = 10)
	public double getUsepoints() {
		return this.usepoints;
	}

	public void setUsepoints(double usepoints) {
		this.usepoints = usepoints;
	}

	@Column(name = "VOUCHERSID", length = 20)
	public String getVouchersid() {
		return this.vouchersid;
	}

	public void setVouchersid(String vouchersid) {
		this.vouchersid = vouchersid;
	}

	@Column(name = "GOODID", length = 1000)
	public String getGoodid() {
		return this.goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	@Column(name = "GOODSNAME", length = 5000)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "NEEDQUANTITY", nullable = false)
	public int getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(int needquantity) {
		this.needquantity = needquantity;
	}

	@Column(name = "PAYSTATE", nullable = false, length = 1)
	public String getPaystate() {
		return this.paystate;
	}

	public void setPaystate(String paystate) {
		this.paystate = paystate;
	}

	@Column(name = "SHIPPINGSTATE", length = 1)
	public String getShippingstate() {
		return this.shippingstate;
	}

	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}

	@Column(name = "DELIVERADDRESSID", length = 20)
	public String getDeliveraddressid() {
		return this.deliveraddressid;
	}

	public void setDeliveraddressid(String deliveraddressid) {
		this.deliveraddressid = deliveraddressid;
	}

	@Column(name = "SHIPPINGUSERNAME", length = 45)
	public String getShippingusername() {
		return this.shippingusername;
	}

	public void setShippingusername(String shippingusername) {
		this.shippingusername = shippingusername;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "ISPRINTEXPRESS", length = 1)
	public String getIsprintexpress() {
		return this.isprintexpress;
	}

	public void setIsprintexpress(String isprintexpress) {
		this.isprintexpress = isprintexpress;
	}

	@Column(name = "ISPRINTINVOICE", length = 1)
	public String getIsprintinvoice() {
		return this.isprintinvoice;
	}

	public void setIsprintinvoice(String isprintinvoice) {
		this.isprintinvoice = isprintinvoice;
	}

	@Column(name = "ISPRINTFPINVOICE", length = 1)
	public String getIsprintfpinvoice() {
		return this.isprintfpinvoice;
	}

	public void setIsprintfpinvoice(String isprintfpinvoice) {
		this.isprintfpinvoice = isprintfpinvoice;
	}

	@Column(name = "EXPRESSNUMBER", length = 50)
	public String getExpressnumber() {
		return this.expressnumber;
	}

	public void setExpressnumber(String expressnumber) {
		this.expressnumber = expressnumber;
	}

	@Column(name = "TRADE_NO", length = 45)
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Column(name = "USERID", length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "LOGISTICSNAME", length = 45)
	public String getLogisticsname() {
		return this.logisticsname;
	}

	public void setLogisticsname(String logisticsname) {
		this.logisticsname = logisticsname;
	}

	@Column(name = "ERROR_ORDER_TAG", length = 1)
	public String getErrorOrderTag() {
		return this.errorOrderTag;
	}

	public void setErrorOrderTag(String errorOrderTag) {
		this.errorOrderTag = errorOrderTag;
	}

	@Column(name = "PRODUCTINFO", nullable = false, length = 2000)
	public String getProductinfo() {
		return this.productinfo;
	}

	public void setProductinfo(String productinfo) {
		this.productinfo = productinfo;
	}

	@Column(name = "GOODSINFO", nullable = false, length = 1000)
	public String getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(String goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	@Column(name = "VERSIONT")
	public Integer getVersiont() {
		return this.versiont;
	}

	public void setVersiont(Integer versiont) {
		this.versiont = versiont;
	}

	@Column(name = "ORDERNAME", nullable = false, length = 1000)
	public String getOrdername() {
		return this.ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
