package com.example.lastlibrary.daos;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.lastlibrary.contractor.BooksInterface;
import com.example.lastlibrary.models.Book;
import com.example.lastlibrary.models.BookPublishers;
import com.example.lastlibrary.mapper.BookPublishersMapper;
import com.example.lastlibrary.mapper.BooksMapper;
@Component
public class BooksDao  implements BooksInterface{
	

		JdbcTemplate jdbcTemplate;
		private String SQL_GET_BOOKS= "select * from  bb_books";
		private String SQL_GET_BOOK= "select * from  bb_books where publisherid = ?";
		private String SQL_GET_PUBLISHERS= "select * from  bb_publishers";
		private String SQL_ADD_BOOK="insert into bb_books(publisherid,isbnnumber,price,pages) values(?,?,?,?)";
		private String SQL_DELETE_BOOK= "DELETE FROM bb_books WHERE bookid = ?";
		private String SQL_UPDATE_BOOK = "update bb_books set publisherid=?,isbnnumber=? where bookid=? ";
		
		@Autowired
		public BooksDao(DataSource dataSource) {
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
		

		public ArrayList<Book> getBooks() {
			
			return (ArrayList<Book>) jdbcTemplate.query(SQL_GET_BOOKS,new BooksMapper());
		}

		
		public ArrayList<BookPublishers> getPublishers() {
			
			return (ArrayList<BookPublishers>) jdbcTemplate.query(SQL_GET_PUBLISHERS,new BookPublishersMapper());
		}


		@Override
		public void addBook(Book book) {
			jdbcTemplate.update(SQL_ADD_BOOK,book.getPublisherid(),book.getIsbnnumber(),book.getPrice(),book.getPages());
			
		}


		@Override
		public void deleteBook(int id) {
			jdbcTemplate.update(SQL_DELETE_BOOK,id);
			
			
		}


		@Override
		public void updateBook(Book book) {
			jdbcTemplate.update(SQL_UPDATE_BOOK,book.getPublisherid(),book.getIsbnnumber(),book.getBookid());
			
		}


		@SuppressWarnings("deprecation")
		public ArrayList<Book> getBooksByPublisherId(int publisherId) {
	        List<Book> books = jdbcTemplate.query(SQL_GET_BOOK, new Object[]{publisherId}, new BooksMapper());

	        // Convert List<Book> to ArrayList<Book>
	        return new ArrayList<>(books);
	    }


		@Override
		public ArrayList<Book> getBooks(int id) {
			// TODO Auto-generated method stub
			return null;
		}
}



