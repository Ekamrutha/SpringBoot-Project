package com.wipro.Capstone.global;

import java.time.LocalDateTime;

public class UserCustomError {
	private LocalDateTime Timestamp;
	private int ErrorStatusCode;
	private String ErrorStatusMsg;
	private String msg;

	public LocalDateTime getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		Timestamp = timestamp;
	}

	public int getErrorStatusCode() {
		return ErrorStatusCode;
	}

	public void setErrorStatusCode(int errorStatusCode) {
		ErrorStatusCode = errorStatusCode;
	}

	public String getErrorStatusMsg() {
		return ErrorStatusMsg;
	}

	public void setErrorStatusMsg(String errorStatusMsg) {
		ErrorStatusMsg = errorStatusMsg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
