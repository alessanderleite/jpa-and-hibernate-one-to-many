package br.com.alessanderleite.app.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.app.model.Book;

public interface BookService {
	
	List<Book> findAll();
	Optional<Book> findById(Long id);
	Book create(Book book);
	void update(Book book);
	void deleteById(Long id);
}
