package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Book;
import com.cg.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Book getBook(@PathVariable int id) {
		return service.fetchBook(id);
	}
	
	@PostMapping(value="/add", produces = "application/json", 
			consumes = "application/json")
	public Book saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	@GetMapping(produces ="application/json" )
	public List<Book> getAllBooks(){
		return service.getAll();
	}
	
	
	@DeleteMapping(value="/remove")
	public boolean deleteBook(@RequestParam("id") int id) {
		return service.delete(id);
		 
	}

}
