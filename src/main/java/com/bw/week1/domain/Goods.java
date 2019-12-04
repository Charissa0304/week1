package com.bw.week1.domain;
/**
 * 
    * @ClassName: Goods
    * @Description:商品表
    * @author YWY
    * @date 2019年12月3日
    *
 */
public class Goods {
	
	private Integer gid;
	private String gname;
	private String datea;
	private Integer bid;
	private Integer tid;
	private Double price;
	private Integer status;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Goods(Integer gid, String gname, String datea, Integer bid, Integer tid, Double price, Integer status) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.datea = datea;
		this.bid = bid;
		this.tid = tid;
		this.price = price;
		this.status = status;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", datea=" + datea + ", bid=" + bid + ", tid=" + tid
				+ ", price=" + price + ", status=" + status + "]";
	}
	
	
	
	

}
