package com.course.spring.springcore.propertyplaceholder.assignment;

public class WSClient {

	private String url;
	private String username;
	private String password;

	public WSClient(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WSClient [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
