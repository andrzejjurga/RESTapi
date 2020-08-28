package com.example.restservice;
import java.util.Date;
public class Greeting {

	private final long id;
	private final String content;
	private final Date time;

	public Greeting(long id, String content, Date time) {
		this.id = id;
		this.content = content;
		this.time = time;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public Date getTime() {
		return time;
	}
}
