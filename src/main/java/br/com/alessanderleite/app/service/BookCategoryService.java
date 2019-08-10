package br.com.alessanderleite.app.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.app.model.BookCategory;

public interface BookCategoryService {

	List<BookCategory> findAll();
	Optional<BookCategory> findById(Long id);
	BookCategory create(BookCategory bookCategory);
	void update(BookCategory bookCategory);
	void deleteById(Long id);
}
