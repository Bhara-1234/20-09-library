package com.example.lastlibrary.contractor;

import java.util.ArrayList;

import com.example.lastlibrary.models.Book;
import com.example.lastlibrary.models.BookPublishers;

public interface LibraryRepository {
	
	
	public ArrayList<Book> getBooks();
	public ArrayList<BookPublishers> getPublishers();
	public void addBook(Book book);
	public void DeleteBook(int id);
	public void updateBook(Book book);
	public ArrayList<Book> getBooks(int id);
	public ArrayList<Book> getBooksByPublisherId(int publisherId);

}
