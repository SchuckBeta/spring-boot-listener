package com.example.entity;

import java.util.Date;

/**
 * 订单
 * @author chenh
 *
 */
public class Order {
	private String name;
	private Date time;
	private String persion;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getPersion() {
		return persion;
	}
	public void setPersion(String persion) {
		this.persion = persion;
	}
}
