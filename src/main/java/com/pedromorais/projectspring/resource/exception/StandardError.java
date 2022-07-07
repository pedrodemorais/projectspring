package com.pedromorais.projectspring.resource.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer satatus;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer satatus, String msg, Long timeStamp) {
		super();
		this.satatus = satatus;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getSatatus() {
		return satatus;
	}

	public void setSatatus(Integer satatus) {
		this.satatus = satatus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	

}
