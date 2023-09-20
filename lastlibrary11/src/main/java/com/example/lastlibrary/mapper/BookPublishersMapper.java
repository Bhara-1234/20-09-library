package com.example.lastlibrary.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.lastlibrary.models.BookPublishers;

public class BookPublishersMapper  implements RowMapper<BookPublishers>{

	@Override
	public BookPublishers mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookPublishers bp = new BookPublishers();
		bp.setPublisherid(rs.getInt(1));
		bp.setPublishername(rs.getString(2));
		return bp;
	}

}
