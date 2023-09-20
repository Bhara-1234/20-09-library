package com.example.lastlibrary.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.example.lastlibrary.models.Book;

public class BooksMapper implements RowMapper<Book> {
	
	
@Override
public  Book mapRow(ResultSet rs, int rowNum) throws SQLException {
	Book i=new Book();
	i.setBookid(rs.getInt(1));
	i.setPublisherid(rs.getInt(2));
	i.setIsbnnumber(rs.getString(3));
	i.setPrice(rs.getInt(4));
	i.setPages(rs.getInt(5));
	//i.setInsr_cdate(rs.getDate(3));
	return i;
	
}
	
}
