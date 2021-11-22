package com.beta.replyservice;

public class ReplyMessage {

	private short code;
	private final String message;
	
	public ReplyMessage(short code, String message) {
		this.code = code;
		this.message = message;
	}

	public ReplyMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public short getCode() {
		return code;
	}

	public void setCode(short code) {
		this.code = code;
	}
	
}