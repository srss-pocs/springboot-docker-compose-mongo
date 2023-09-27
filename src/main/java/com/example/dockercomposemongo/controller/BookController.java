package com.example.dockercomposemongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockercomposemongo.model.Book;
import com.example.dockercomposemongo.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository repository;

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return repository.save(book);
	}

	@GetMapping
	public List<Book> getBooks() {
		return repository.findAll();
	}

}
