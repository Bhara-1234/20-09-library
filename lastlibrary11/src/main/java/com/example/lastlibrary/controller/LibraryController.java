package com.example.lastlibrary.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lastlibrary.contractor.LibraryRepository;
import com.example.lastlibrary.models.Book;
import com.example.lastlibrary.models.BookPublishers;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository lbr;

	@GetMapping(value="/publishers")
	public ArrayList<BookPublishers> getPublishers(){
		System.out.println("bharadwaj");
		ArrayList<BookPublishers> bp = lbr.getPublishers();
		BookPublishers ba = bp.get(0);
		  int a=ba.getPublisherid();
		  System.out.println(a);
		System.out.println(bp.size());
		return bp;
		
	}

	
	@RequestMapping(value="/books/{publisherId}")
	public ArrayList<Book> getBooks(@PathVariable("publisherId") int publisherId){
		System.out.println("bharadwaj");
		ArrayList<Book> bp = lbr.getBooksByPublisherId(publisherId);
		return bp;
		
	}
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		lbr.addBook(book);
		
	}
	@RequestMapping(value="/deleteBook/{id}",method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") int id) {
		lbr.DeleteBook(id);
		
	}
	@RequestMapping(value="/save",method=RequestMethod.PUT)
	public void updateBook(@RequestBody Book book) {
		lbr.updateBook(book);
		
	}
	
	@GetMapping(value="/first/{publisherId}")
	public Book firstBook(@PathVariable("publisherId") int publisherId) {
		ArrayList<Book> bp = lbr.getBooksByPublisherId(publisherId);
		Book bk = bp.get(0);
		return bk;
		
	}
	@GetMapping(value="/last/{publisherId}")
	public Book lastBook(@PathVariable("publisherId") int publisherId) {
		ArrayList<Book> bp = lbr.getBooksByPublisherId(publisherId);
		int len = (bp.size())-1;
		Book bk = bp.get(len);
		return bk;
		
	}
	@GetMapping(value="/next/{index}/{publisherId}")
	public Book nextBook(@PathVariable("index") int index,@PathVariable("publisherId") int publisherId) {
		ArrayList<Book> bp = lbr.getBooksByPublisherId(publisherId);
		Book bk = bp.get(index);
		
		return bk;
		
	}
	@GetMapping(value="/previous/{index}/{publisherId}")
	public Book previousBook(@PathVariable("index") int index,@PathVariable("publisherId") int publisherId) {
		ArrayList<Book> bp = lbr.getBooksByPublisherId(publisherId);
		Book bk = bp.get(index);
		
		return bk;
		
	}
	
	
}

