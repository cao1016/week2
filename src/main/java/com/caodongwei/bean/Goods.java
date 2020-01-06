package com.caodongwei.bean;

import java.math.BigInteger;
import java.util.Date;

public class Goods {
	private BigInteger id;
	private String zi;
	private String shu;
	private String name;
	private String pin;
	private String zhi;
	private Double ben;
	private Date cheng;
	private Date jian;
	private String tai;
	private String zhu;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(BigInteger id, String zi, String shu, String name, String pin, String zhi, Double ben, Date cheng,
			Date jian, String tai, String zhu) {
		super();
		this.id = id;
		this.zi = zi;
		this.shu = shu;
		this.name = name;
		this.pin = pin;
		this.zhi = zhi;
		this.ben = ben;
		this.cheng = cheng;
		this.jian = jian;
		this.tai = tai;
		this.zhu = zhu;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getZi() {
		return zi;
	}
	public void setZi(String zi) {
		this.zi = zi;
	}
	public String getShu() {
		return shu;
	}
	public void setShu(String shu) {
		this.shu = shu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getZhi() {
		return zhi;
	}
	public void setZhi(String zhi) {
		this.zhi = zhi;
	}
	public Double getBen() {
		return ben;
	}
	public void setBen(Double ben) {
		this.ben = ben;
	}
	public Date getCheng() {
		return cheng;
	}
	public void setCheng(Date cheng) {
		this.cheng = cheng;
	}
	public Date getJian() {
		return jian;
	}
	public void setJian(Date jian) {
		this.jian = jian;
	}
	public String getTai() {
		return tai;
	}
	public void setTai(String tai) {
		this.tai = tai;
	}
	public String getZhu() {
		return zhu;
	}
	public void setZhu(String zhu) {
		this.zhu = zhu;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", zi=" + zi + ", shu=" + shu + ", name=" + name + ", pin=" + pin + ", zhi=" + zhi
				+ ", ben=" + ben + ", cheng=" + cheng + ", jian=" + jian + ", tai=" + tai + ", zhu=" + zhu + "]";
	}
	
}
