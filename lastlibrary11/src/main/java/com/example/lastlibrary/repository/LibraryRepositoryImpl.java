package com.example.lastlibrary.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.lastlibrary.contractor.BooksInterface;
import com.example.lastlibrary.contractor.LibraryRepository;
import com.example.lastlibrary.contractor.PublisherInterface;
import com.example.lastlibrary.models.Book;
import com.example.lastlibrary.models.BookPublishers;

@Repository
public class LibraryRepositoryImpl implements LibraryRepository{
	
	
	
	@Autowired
	BooksInterface bi;
	

	@Override
	public ArrayList<Book> getBooks() {
			return  bi.getBooks();
	}

	@Override
	public ArrayList<BookPublishers> getPublishers() {
		// TODO Auto-generated method stub
		 ArrayList<BookPublishers> s= bi.getPublishers();
		return s ;
	}

	@Override
	public void addBook(Book book) {
		bi.addBook(book);
		
	}

	@Override
	public void DeleteBook(int id) {
		bi.deleteBook(id);
		
	}

	@Override
	public void updateBook(Book book) {
		bi.updateBook(book);
		
	}

	@Override
	public ArrayList<Book> getBooks(int id) {
		return bi.getBooks(id);
	}
	
	public ArrayList<Book> getBooksByPublisherId(int publisherId){
		 return bi.getBooksByPublisherId(publisherId);
	}
}
