package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
