package com.example.demo.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ErrorDetails implements Serializable {
	private static final long serialVersionUID = -4976134880343831254L;
	int httpStatus;
	String message;
	LocalDateTime timestamp;

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public ErrorDetails(int httpStatus, String message, LocalDateTime timestamp) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
		this.timestamp = timestamp;
	}

}
