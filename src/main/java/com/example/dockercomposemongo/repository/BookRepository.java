package com.example.dockercomposemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dockercomposemongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
