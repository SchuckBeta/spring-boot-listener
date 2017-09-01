package com.example.entity;

import java.util.Date;

/**
 * 消息
 * @author chenh
 *
 */
public class Message {
	private String msg;
	private Date time;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
