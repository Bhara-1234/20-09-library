package com.example.lastlibrary.models;

public class BookPublishers {

	private int publisherid;
	private String publishername;
	public BookPublishers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookPublishers(int publisherid, String publishername) {
		super();
		this.publisherid = publisherid;
		this.publishername = publishername;
	}
	public int getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(int publisherid) {
		this.publisherid = publisherid;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	
}
