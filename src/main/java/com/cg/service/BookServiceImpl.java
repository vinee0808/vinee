package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Book;
import com.cg.repo.BookRepo;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo repo;

	@Override
	public Book saveBook(Book book) {
		return repo.save(book);		
	}

	@Override
	public Book fetchBook(int id) {
		return repo.findById(id).get();

	}

	@Override
	public List<Book> getAll() {
		return repo.findAll();
	}


	@Override
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}

}
