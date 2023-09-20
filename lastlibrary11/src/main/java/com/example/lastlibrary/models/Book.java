package com.example.lastlibrary.models;

public class Book {
	int bookid;
	int publisherid;
	String isbnnumber;
	int price;
	int pages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, int publisherid, String isbnnumber,int price,int pages) {
		super();
		this.bookid = bookid;
		this.publisherid = publisherid;
		this.isbnnumber = isbnnumber;
		this.price=price;
		this.pages=pages;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(int publisherid) {
		this.publisherid = publisherid;
	}
	public String getIsbnnumber() {
		return isbnnumber;
	}
	public void setIsbnnumber(String isbnnumber) {
		this.isbnnumber = isbnnumber;
	}
	public int getPrice() {
		return price;
	}
	public int getPages() {
		return pages;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
