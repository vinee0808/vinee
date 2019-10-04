package com.cg.service;

import java.util.List;

import com.cg.entity.Book;

public interface BookService {

	 Book saveBook(Book book);

	 Book fetchBook(int id);

	List<Book> getAll();

	//void update(Book book);


	boolean delete(int id);

}
